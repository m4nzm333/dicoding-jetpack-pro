package com.unlistedi.moviecatalogqw;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.unlistedi.moviecatalogqw.data.MovieEntity;
import com.unlistedi.moviecatalogqw.utils.FakeDataDummy;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class DetailActivityTest {
    private MovieEntity movieEntity = FakeDataDummy.getMovies().get(0);

    @Rule
    public ActivityTestRule<DetailActivity> activityRule = new ActivityTestRule<DetailActivity>(DetailActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailActivity.class);
            result.putExtra(DetailActivity.EXTRA_MOVIE, movieEntity);
            return result;
        }
    };

    @Test
    public void loadDetailMovies() {
        onView(withId(R.id.tvDetailTitle)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDetailTitle)).check(matches(withText(movieEntity.getTitle())));
        onView(withId(R.id.tvDetailYear)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDetailYear)).check(matches(withText(movieEntity.getYear())));
        onView(withId(R.id.tvDetailScore)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDetailScore)).check(matches(withText(String.valueOf(movieEntity.getScore()))));
        onView(withId(R.id.tvDetailDescription)).check(matches(isDisplayed()));
        onView(withId(R.id.tvDetailDescription)).check(matches(withText(String.valueOf(movieEntity.getDescription()))));
        onView(withId(R.id.gvGenre)).check(matches(isDisplayed()));
        onView(withId(R.id.ivDetailPoster)).check(matches(isDisplayed()));
    }
}
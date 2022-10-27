package com.unlistedi.moviecatalogqw;

import androidx.test.rule.ActivityTestRule;

import com.unlistedi.moviecatalogqw.testing.SingleFragmentActivity;
import com.unlistedi.moviecatalogqw.ui.movies.MoviesFragment;
import com.unlistedi.moviecatalogqw.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MoviesFragmentTest {

    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private MoviesFragment moviesFragment = new MoviesFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(moviesFragment);
    }

    @Test
    public void loadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()));
        onView(withId(R.id.rvMovies)).check(new RecyclerViewItemCountAssertion(19));
    }
}
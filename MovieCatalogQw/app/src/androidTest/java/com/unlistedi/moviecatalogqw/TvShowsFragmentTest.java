package com.unlistedi.moviecatalogqw;

import androidx.test.rule.ActivityTestRule;

import com.unlistedi.moviecatalogqw.testing.SingleFragmentActivity;
import com.unlistedi.moviecatalogqw.ui.movies.MoviesFragment;
import com.unlistedi.moviecatalogqw.ui.tvshows.TvShowsFragment;
import com.unlistedi.moviecatalogqw.utils.RecyclerViewItemCountAssertion;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class TvShowsFragmentTest {

    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private TvShowsFragment tvShowsFragment = new TvShowsFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(tvShowsFragment);
    }

    @Test
    public void loadTvShows() {
        onView(withId(R.id.rvTvShows)).check(matches(isDisplayed()));
        onView(withId(R.id.rvTvShows)).check(new RecyclerViewItemCountAssertion(20));
    }
}
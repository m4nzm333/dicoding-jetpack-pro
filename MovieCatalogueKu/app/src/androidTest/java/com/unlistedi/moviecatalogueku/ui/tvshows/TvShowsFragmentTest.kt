package com.unlistedi.moviecatalogueku.ui.tvshows

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.unlistedi.moviecatalogueku.R
import com.unlistedi.moviecatalogueku.testing.SingleFragmentActivity
import com.unlistedi.moviecatalogueku.utils.RecyclerViewItemCountAssertion
import kotlinx.android.synthetic.main.fragment_tv_shows.view.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TvShowsFragmentTest {
    @get:Rule
    val activityRule = ActivityTestRule<SingleFragmentActivity>(SingleFragmentActivity::class.java)
    val tvShowsFragment = TvShowsFragment()

    @Before
    fun setUp(){
        activityRule.activity.setFragment(tvShowsFragment)
    }

    @Test
    fun loadTvShow(){
        onView(withId(R.id.rvTvShows)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShows)).check(RecyclerViewItemCountAssertion(20))
    }
}
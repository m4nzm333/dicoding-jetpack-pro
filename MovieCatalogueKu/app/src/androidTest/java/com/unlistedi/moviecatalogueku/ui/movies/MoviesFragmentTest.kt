package com.unlistedi.moviecatalogueku.ui.movies

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.unlistedi.moviecatalogueku.R
import com.unlistedi.moviecatalogueku.testing.SingleFragmentActivity
import com.unlistedi.moviecatalogueku.utils.RecyclerViewItemCountAssertion
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MoviesFragmentTest {
    @get:Rule
    val activityRule = ActivityTestRule<SingleFragmentActivity>(SingleFragmentActivity::class.java)
    val moviesFragment = MoviesFragment()

    @Before
    fun setUp(){
        activityRule.activity.setFragment(moviesFragment)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).check(RecyclerViewItemCountAssertion(19))
    }
}
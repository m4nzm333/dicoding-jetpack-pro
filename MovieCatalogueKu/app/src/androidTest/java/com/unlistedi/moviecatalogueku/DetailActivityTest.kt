package com.unlistedi.moviecatalogueku

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.unlistedi.moviecatalogueku.utils.FakeDataDummy
import org.hamcrest.CoreMatchers.containsString
import org.junit.Rule
import org.junit.Test

class DetailActivityTest {
    private val dummyMovies = FakeDataDummy.getMovies()[0]

    @get:Rule
    val activityRule = ActivityTestRule<DetailActivity>(DetailActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.tvDetailTitle)).check(matches(isDisplayed()))
        Thread.sleep(100)
        onView(withId(R.id.tvDetailTitle)).check(matches(withText("AppCompatTextView{id=2131230979, res-name=tvDetailTitle, visibility=VISIBLE, width=996, height=85, has-focus=false, has-focusable=false, has-window-focus=true, is-clickable=false, is-enabled=true, is-focused=false, is-focusable=false, is-layout-requested=false, is-selected=false, layout-params=androidx.constraintlayout.widget.ConstraintLayout\$LayoutParams@cd60e48, tag=null, root-is-layout-requested=false, has-input-connection=false, x=42.0, y=42.0, text=, input-type=0, ime-target=false, has-links=false}")))
    }

}
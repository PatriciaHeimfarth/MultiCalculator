package de.softwarebuilding.multicalculator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class InstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(ScrollingActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("de.softwarebuilding.multicalculator", appContext.packageName)
    }

    @Test
    fun messageShows() {
        onView(withId(R.id.weight)).perform(typeText("100"))
        onView(withId(R.id.height)).perform(typeText("200"))
    }


}
package com.felipecastilhos.shotthis

import androidx.test.espresso.intent.rule.IntentsTestRule
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

class MainActivityTest: ScreenshotTest {
    @Rule @JvmField
    var activityRule: IntentsTestRule<MainActivity> =
        IntentsTestRule(MainActivity::class.java, true, false)

    @Test
    fun theActivityIsShownProperly() {
        val firstFragment = startActivity()

        compareScreenshot(firstFragment)
    }

    private fun startActivity(): MainActivity {
        return activityRule.launchActivity(null)
    }
}
package com.example.affirmations

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.v7.widget.RecyclerView
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.regex.Pattern.matches
//
//class AffirmationsListTests {
//
//    @RunWith(AndroidJUnit4::class)
//
//    @get:Rule
//    val activity = ActivityScenarioRule(MainActivity::class.java)
//
//    @Test
//    fun scroll_to_item() {
//        onView(withId(R.id.recycler_view)).perform(
//            RecyclerViewActions
//                .scrollTo<RecyclerView.ViewHolder>(
//                    withText(R.string.affirmation10)
//                )
//        )
//
//        onView(withText(R.string.affirmation10))
//            .check(matches(isDisplayed())
//            )
//    }
//
//}
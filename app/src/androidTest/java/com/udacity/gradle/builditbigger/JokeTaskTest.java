package com.udacity.gradle.builditbigger;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import org.hamcrest.Matchers;

/**
 * Created by jp0517 on 4/22/18.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testJokeRetrieval() {
        Espresso.onView(ViewMatchers.withId(R.id.joke_button))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(com.jp0517.jokedisplay.R.id.joke_view))
                .check(ViewAssertions.matches(Matchers.not(ViewMatchers.withText(""))));

        Espresso.onView(ViewMatchers.withId(com.jp0517.jokedisplay.R.id.joke_view))
                .check(ViewAssertions.matches(Matchers.not(ViewMatchers.withText("connect timed out"))));
    }
}

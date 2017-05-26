package com.example.mcjes.password_validator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;

/**
 * Created by mcjes on 2017-05-25.
 */

public class EspressoTest {
        private String passwordStrong, passwordWeak;
        @Rule
        public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
                MainActivity.class);
        @Before
        public void setString1(){ passwordStrong="A@BC%76asd8123"; }
        @Before
        public void setString2(){ passwordWeak="password";}
        @Test
        public void testWeak(){
            onView(withId(R.id.editText)).perform(typeText(passwordWeak));
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Your password is not strong enough!")));
        }
        @Test
        public void testStrong(){
            onView(withId(R.id.editText)).perform(typeText(passwordWeak));
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textView)).check(matches(withText("Your password is strong enough!")));
        }


}


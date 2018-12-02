package com.mytaxi.android_demo.helpers;

import android.support.annotation.IdRes;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/************************************************************************************/
//Helper performs basic Espresso actions
/************************************************************************************/

public abstract class HelperBase {
    protected ApplicationManager manager;

    public static void typeIntoViewWithId(String text, @IdRes int viewId) {
        onView(withId(viewId)).perform(typeText(text));
    }

    public static void clickViewWithText(String text) {
        onView(withText(text)).perform(click());
    }

    public static void clickViewWithID(@IdRes int viewID) {
        onView(withId(viewID)).perform(click());
    }

    public static void openMenuOnViewWithId(@IdRes int viewID) {
        onView(withId(viewID)).perform(DrawerActions.open());
    }

    public static void closeMenuOnViewWithId(@IdRes int viewID) {
        onView(withId(viewID)).perform(DrawerActions.close());
    }

    public static void checkTextOnViewWithId(String text, @IdRes int viewID) {
        onView(withId(viewID)).check(matches(ViewMatchers.withText((text))));
    }

}

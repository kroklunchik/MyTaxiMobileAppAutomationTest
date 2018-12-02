package com.mytaxi.android_demo.helpers;

import android.content.Intent;
import android.support.test.espresso.matcher.ViewMatchers;

import com.mytaxi.android_demo.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

public class DriverHelper extends HelperBase{
    public void checkDialIntent() {
        intended(allOf(hasAction(Intent.ACTION_DIAL)));
    }

    public void callDriver() {
        clickViewWithID(R.id.fab);
    }

    public void checkDriverIsExpected(String driver) {
        onView(withId(R.id.textViewDriverName)).check(matches(ViewMatchers.withText((driver))));
    }
}

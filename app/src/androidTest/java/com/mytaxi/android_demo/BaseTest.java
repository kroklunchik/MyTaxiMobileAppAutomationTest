package com.mytaxi.android_demo;

import android.Manifest;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.GrantPermissionRule;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.helpers.ApplicationManager;
import org.junit.BeforeClass;
import org.junit.Rule;
import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class BaseTest {

    @Rule
   public IntentsTestRule<MainActivity> mActivityRule = new IntentsTestRule<>(MainActivity.class);

    @Rule public GrantPermissionRule permissionRule = GrantPermissionRule.grant(Manifest.permission.ACCESS_FINE_LOCATION);

    protected static ApplicationManager applicationManager;

    @BeforeClass
    public static void  userCreation() throws Exception {
        getInstrumentation().getTargetContext().deleteSharedPreferences("MytaxiPrefs");
        applicationManager = new ApplicationManager();
    }

    public boolean NotLoggedIn() {
        try {
            onView(withId(R.id.edt_username)).check(matches(isDisplayed())).perform(click());
            return true;
        } catch (NoMatchingViewException e) {
            return false;        }
    }
}

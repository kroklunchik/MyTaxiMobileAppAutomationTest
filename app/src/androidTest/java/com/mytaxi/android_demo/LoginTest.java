package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

@RunWith(AndroidJUnit4.class)
public class LoginTest extends BaseTest {

    @Test
    public void LoginTest1() throws Exception {
        applicationManager.getAuthenticationHelper().inputUserCredentials();
        applicationManager.getAuthenticationHelper().clickLoginButton();
        applicationManager.getMenuHelper().checkLoginSuccesfull();
    }

    @Test
    public void LoginTest22() throws Exception {
        applicationManager.getAuthenticationHelper().inputUserCredentials();
        applicationManager.getAuthenticationHelper().clickLoginButton();
        applicationManager.getMenuHelper().checkLoginSuccesfull();
    }

    @Test
    public void LoginTest33() throws Exception {
        applicationManager.getAuthenticationHelper().inputUserCredentials();
        applicationManager.getAuthenticationHelper().clickLoginButton();
        applicationManager.getMenuHelper().checkLoginSuccesfull();
    }

    @After
    public void tearDown() throws Exception {
        getInstrumentation().getTargetContext().deleteSharedPreferences("MytaxiPrefs");
    }
}

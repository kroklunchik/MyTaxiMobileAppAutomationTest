package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SearchTest extends BaseTest {


    @Before
    public void loginForSearch() throws Exception {
        if(NotLoggedIn()){
        applicationManager.getAuthenticationHelper().inputUserCredentials();
        applicationManager.getAuthenticationHelper().clickLoginButton();
    }}


     @Test
    public void SearchTest1() throws Exception {
        applicationManager.getSearchHelper().typeSearchQuery("sa");
        applicationManager.getSearchHelper().pickSearchResultByName("Sarah Scott");
        applicationManager.getDriverHelper().checkDriverIsExpected("Sarah Scott");
        applicationManager.getDriverHelper().callDriver();
        applicationManager.getDriverHelper().checkDialIntent();
    }


    @Test
    public void SearchTest22() throws Exception {
        applicationManager.getSearchHelper().typeSearchQuery("an");
        applicationManager.getSearchHelper().pickSearchResultByName("Angelina Roussel");
        applicationManager.getDriverHelper().checkDriverIsExpected("Angelina Roussel");
        applicationManager.getDriverHelper().callDriver();
        applicationManager.getDriverHelper().checkDialIntent();
    }


    @Test
    public void SearchTest33() throws Exception {
        applicationManager.getSearchHelper().typeSearchQuery("be");
        applicationManager.getSearchHelper().pickSearchResultByName("Benjamin Hart");
        applicationManager.getDriverHelper().checkDriverIsExpected("Benjamin Hart");
        applicationManager.getDriverHelper().callDriver();
        applicationManager.getDriverHelper().checkDialIntent();
    }
}


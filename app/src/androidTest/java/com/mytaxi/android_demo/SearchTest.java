package com.mytaxi.android_demo;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class SearchTest extends BaseTest {

    //login only if application is not logged in
    @Before
    public void loginForSearch() throws Exception {
        if(NotLoggedIn()){
        applicationManager.getAuthenticationHelper().inputUserCredentials();
        applicationManager.getAuthenticationHelper().clickLoginButton();
    }}


     @Test
    public void SearchTestDefault() throws Exception {
        applicationManager.getSearchHelper().typeSearchQuery("sa");
        applicationManager.getSearchHelper().pickSearchResultByName("Sarah Scott");
        applicationManager.getDriverHelper().checkDriverIsExpected("Sarah Scott");
        applicationManager.getDriverHelper().callDriver();
        applicationManager.getDriverHelper().checkDialIntent();
    }


    @Test
    public void SearchTestAngelinaRoussel() throws Exception {
        applicationManager.getSearchHelper().typeSearchQuery("an");
        applicationManager.getSearchHelper().pickSearchResultByName("Angelina Roussel");
        applicationManager.getDriverHelper().checkDriverIsExpected("Angelina Roussel");
        applicationManager.getDriverHelper().callDriver();
        applicationManager.getDriverHelper().checkDialIntent();
    }

}


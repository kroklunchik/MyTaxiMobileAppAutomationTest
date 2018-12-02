package com.mytaxi.android_demo.helpers;

import com.mytaxi.android_demo.data.UserCredentials;
import org.json.JSONException;
import java.io.IOException;
/************************************************************************************/
//Stores all needed helpers and UserCredentials
/************************************************************************************/
public class ApplicationManager {
    protected static UserCredentials userCredentials;
    private AuthenticationHelper authenticationHelper;
    private MenuHelper menuHelper;
    private DriverHelper driverHelper;
    private SearchHelper searchHelper;

    public ApplicationManager() throws IOException, JSONException {
        userCredentials = new UserCredentials();
    }

    public AuthenticationHelper getAuthenticationHelper() {
        if(authenticationHelper == null)
            authenticationHelper = new AuthenticationHelper();
        return authenticationHelper;
    }

    public MenuHelper getMenuHelper() {
        if(menuHelper == null)
            menuHelper = new MenuHelper();
        return menuHelper;
    }

    public DriverHelper getDriverHelper() {
        if(driverHelper == null)
            driverHelper = new DriverHelper();
        return driverHelper;
    }

    public SearchHelper getSearchHelper() {
        if(searchHelper == null)
            searchHelper = new SearchHelper();
        return searchHelper;
    }
}

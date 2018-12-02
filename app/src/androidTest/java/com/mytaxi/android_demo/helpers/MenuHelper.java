package com.mytaxi.android_demo.helpers;

import com.mytaxi.android_demo.R;

import static com.mytaxi.android_demo.helpers.ApplicationManager.userCredentials;

public class MenuHelper extends HelperBase {

    public void checkLoginSuccesfull() {
        openMenuOnViewWithId(R.id.drawer_layout);
        checkTextOnViewWithId(userCredentials.getUsername(),R.id.nav_username);
    }

}

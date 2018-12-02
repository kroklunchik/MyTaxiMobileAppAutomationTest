package com.mytaxi.android_demo.helpers;

import com.mytaxi.android_demo.R;

import static com.mytaxi.android_demo.helpers.ApplicationManager.userCredentials;
/************************************************************************************/
//Helper performs actions on Authentication activity
/************************************************************************************/
public class AuthenticationHelper extends HelperBase {

    public void clickLoginButton() {
        clickViewWithID(R.id.btn_login);
    }

    public void inputUserCredentials() {
        typeIntoViewWithId(userCredentials.getUsername(),R.id.edt_username);
        typeIntoViewWithId(userCredentials.getPassword(),R.id.edt_password);
    }
}

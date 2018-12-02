package com.mytaxi.android_demo.data;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/************************************************************************************/
//Making request to API, converting String to JSON, extracting username and password
/************************************************************************************/

public class UserCredentials {
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserCredentials() throws IOException, JSONException {
        URL url = new URL("https://randomuser.me/api/?seed=a1f30d446f820665");
        // read from the URL
        Scanner scan = new Scanner(url.openStream());
        String str2 = new String();
        while (scan.hasNext())
            str2 += scan.nextLine();
        scan.close();

        // build a JSON object
        JSONObject obj2 = new JSONObject(str2);
        JSONObject res1 = obj2.getJSONArray("results").getJSONObject(0).getJSONObject("login");
        username=res1.get("username").toString();
        password=res1.get("password").toString();
    }
}

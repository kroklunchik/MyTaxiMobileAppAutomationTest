package com.mytaxi.android_demo.utils.idling;

import android.support.test.espresso.IdlingRegistry;


import okhttp3.OkHttpClient;

public abstract class IdlingResources {

    public static void registerOkHttp(OkHttpClient client) {
        IdlingRegistry.getInstance().register(MyOkHttp3IdlingResource.create(
                "okhttp", client));

    }
}

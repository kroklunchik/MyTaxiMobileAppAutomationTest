package com.mytaxi.android_demo.utils.idling;

import android.support.test.espresso.IdlingResource;

//import com.jakewharton.espresso.OkHttp3IdlingResource;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.test.espresso.IdlingResource;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;

public class MyOkHttp3IdlingResource implements IdlingResource  {

    /**
     * Create a new {@link IdlingResource} from {@code client} as {@code name}. You must register
     * this instance using {@code Espresso.registerIdlingResources}.
     */
    @CheckResult @NonNull
    @SuppressWarnings("ConstantConditions") // Extra guards as a library.
    public static MyOkHttp3IdlingResource create(@NonNull String name, @NonNull OkHttpClient client) {
        if (name == null) throw new NullPointerException("name == null");
        if (client == null) throw new NullPointerException("client == null");
        return new MyOkHttp3IdlingResource(name, client.dispatcher());
    }

    private final String name;
    private final Dispatcher dispatcher;
    volatile ResourceCallback callback;

    private MyOkHttp3IdlingResource(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
        dispatcher.setIdleCallback(new Runnable() {
            @Override public void run() {
                ResourceCallback callback = MyOkHttp3IdlingResource.this.callback;
                if (callback != null) {
                    callback.onTransitionToIdle();
                }
            }
        });
    }

    @Override public String getName() {
        return name;
    }

    @Override public boolean isIdleNow() {
        boolean idle = (dispatcher.runningCallsCount() == 0);
        if (idle && callback != null) callback.onTransitionToIdle();
        return idle;
    }

    @Override public void registerIdleTransitionCallback(ResourceCallback callback) {
        this.callback = callback;
    }
}

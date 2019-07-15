package com.gowgos5.androiddagger;

import android.util.Log;

import javax.inject.Inject;

class Car {
    private static final String TAG = "Car";

    // Field injection (2)
    // @Inject Engine engine;

    // Dependencies
    private Engine engine;
    private Wheels wheels;

    // Constructor injection (1)
    @Inject
    Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // Method injection (3)
    @Inject
    void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    void drive() {
        Log.d(TAG, "driving...");
    }
}

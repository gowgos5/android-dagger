package com.gowgos5.androiddagger.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // Field injection (2)
    // @Inject Engine engine;

    // Dependencies
    private Engine engine;
    private Wheels wheels;

    // Constructor injection (1)
    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    // Method injection (3)
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }
}

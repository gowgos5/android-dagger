package com.gowgos5.androiddagger;

import android.util.Log;

import javax.inject.Inject;

class Remote {
    private static final String TAG = "Remote";

    @Inject
    Remote() {
    }

    void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}

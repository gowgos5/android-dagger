package com.gowgos5.androiddagger.car;

import android.util.Log;

public class Tires {
    // From third-party libraries. Cannot annotate with @Inject.
    private static final String TAG = "Tires";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}

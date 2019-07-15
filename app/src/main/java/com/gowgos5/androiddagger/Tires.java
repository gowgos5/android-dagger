package com.gowgos5.androiddagger;

import android.util.Log;

class Tires {
    // From third-party libraries. Cannot annotate with @Inject.
    private static final String TAG = "Tires";

    void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}

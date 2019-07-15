package com.gowgos5.androiddagger;

import javax.inject.Inject;

class Wheels {
    // From third-party libraries. Cannot annotate with @Inject.

    private Rims rims;
    private Tires tires;

    @Inject
    Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}

package com.gowgos5.androiddagger.car;

import javax.inject.Inject;

public class Wheels {
    // From third-party libraries. Cannot annotate with @Inject.

    private Rims rims;
    private Tires tires;

    @Inject
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}

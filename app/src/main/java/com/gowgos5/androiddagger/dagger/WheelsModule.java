package com.gowgos5.androiddagger.dagger;

import com.gowgos5.androiddagger.car.Rims;
import com.gowgos5.androiddagger.car.Tires;
import com.gowgos5.androiddagger.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}

package com.gowgos5.androiddagger.dagger;

import com.gowgos5.androiddagger.car.DieselEngine;
import com.gowgos5.androiddagger.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}

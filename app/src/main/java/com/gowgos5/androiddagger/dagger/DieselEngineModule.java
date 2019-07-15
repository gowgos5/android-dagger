package com.gowgos5.androiddagger.dagger;

import com.gowgos5.androiddagger.car.DieselEngine;
import com.gowgos5.androiddagger.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}

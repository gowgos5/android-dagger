package com.gowgos5.androiddagger.dagger;

import com.gowgos5.androiddagger.car.PetrolEngine;
import com.gowgos5.androiddagger.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}

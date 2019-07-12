package com.gowgos5.androiddagger;

import dagger.Component;

@Component
public interface CarComponent {
    // Provision method
    Car getCar();

    // Field injection
    void inject(MainActivity mainActivity);
}

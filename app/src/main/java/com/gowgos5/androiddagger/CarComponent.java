package com.gowgos5.androiddagger;

import dagger.Component;

// Annotates an interface or abstract class for which a fully-formed, dependency-injected
// implementation is to be generated from a set of modules.
@Component (modules = WheelsModule.class)
public interface CarComponent {
    // Provision methods have no parameters and return an injected or provided type.
    Car getCar();

    // For Field / Method injection(s)
    void inject(MainActivity mainActivity);
}

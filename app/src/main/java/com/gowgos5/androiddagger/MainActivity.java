package com.gowgos5.androiddagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gowgos5.androiddagger.car.Car;
import com.gowgos5.androiddagger.dagger.CarComponent;
import com.gowgos5.androiddagger.dagger.DaggerCarComponent;
import com.gowgos5.androiddagger.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

        // Called for Field / Method injection(s)
        component.inject(this);

        // Provision method (refer to CarComponent.java)
        // car = component.getCar();

        car.drive();
    }
}

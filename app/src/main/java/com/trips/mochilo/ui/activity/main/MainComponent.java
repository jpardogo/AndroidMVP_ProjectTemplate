package com.trips.mochilo.ui.activity.main;

import com.trips.mochilo.ui.dagger.ActivityScope;
import com.trips.mochilo.ui.dagger.components.AppComponent;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);

}

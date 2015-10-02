package com.trips.mochilo.ui.dagger.components;

import com.trips.mochilo.ui.dagger.ActivityScope;
import com.trips.mochilo.ui.dagger.modules.ActivityModule;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = ActivityModule.class
)
public interface ActivityComponent {
    //Exposed to sub-graphs.
}
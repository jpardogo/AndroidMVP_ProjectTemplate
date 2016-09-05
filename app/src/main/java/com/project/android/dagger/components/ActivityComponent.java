package com.project.android.dagger.components;

import com.project.android.dagger.ActivityScope;
import com.project.android.dagger.modules.ActivityModule;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = ActivityModule.class
)
public interface ActivityComponent {
    //Exposed to sub-graphs.
}
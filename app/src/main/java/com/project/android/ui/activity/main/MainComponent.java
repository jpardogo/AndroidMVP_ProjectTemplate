package com.project.android.ui.activity.main;

import com.project.android.dagger.ActivityScope;
import com.project.android.dagger.components.AppComponent;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);

}

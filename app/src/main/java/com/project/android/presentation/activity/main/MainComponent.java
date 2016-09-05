package com.project.android.presentation.activity.main;

import com.project.android.dagger.ActivityScope;
import com.project.android.dagger.components.AppComponent;
import com.project.android.presentation.fragments.example.ExampleFragment;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MainModule.class
)
public interface MainComponent {
    void inject(MainActivity activity);

    //Fragment in Main
    void inject(ExampleFragment fragment);
}

package com.project.android.dagger.components;

import android.support.v7.app.AppCompatActivity;

import com.project.android.App;
import com.project.android.dagger.modules.AppModule;
import com.project.android.dagger.modules.InteractorsModule;
import com.project.android.data.ExampleInteractor;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class,
                InteractorsModule.class,
        }
)
public interface AppComponent {
    void inject(App app);

    void inject(AppCompatActivity activity);

    ExampleInteractor providesExampleInteractorImpl();
}
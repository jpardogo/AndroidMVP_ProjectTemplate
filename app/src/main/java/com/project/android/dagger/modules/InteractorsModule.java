package com.project.android.dagger.modules;

import com.project.android.data.ExampleInteractor;
import com.project.android.data.ExampleInteractorImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorsModule {
    @Provides
    public ExampleInteractor provideExampleInteractor() {
        return new ExampleInteractorImpl();
    }
}
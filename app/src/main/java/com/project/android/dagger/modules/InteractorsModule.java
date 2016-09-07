package com.project.android.dagger.modules;

import com.project.android.data.ExampleInteractor;

import dagger.Module;
import dagger.Provides;

@Module
public class InteractorsModule {
    @Provides
    public ExampleInteractor provideExampleInteractor() {
        return new ExampleInteractor();
    }
}
package com.trips.mochilo.ui.dagger.modules;

import android.app.Activity;

import com.trips.mochilo.ui.dagger.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Activity activity() {
        return activity;
    }
}
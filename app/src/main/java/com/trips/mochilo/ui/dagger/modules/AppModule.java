package com.trips.mochilo.ui.dagger.modules;

import android.content.Context;

import com.trips.mochilo.Mochilo;
import com.trips.mochilo.ui.dagger.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Mochilo mApp;

    public AppModule(Mochilo app) {
        mApp = app;
    }

    @Provides
    @Singleton
    @ApplicationContext
    public Context provideApplicationContext() {
        return mApp.getApplicationContext();
    }

}
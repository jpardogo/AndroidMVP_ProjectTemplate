package com.project.android.dagger.modules;

import android.content.Context;

import com.project.android.App;
import com.project.android.dagger.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App mApp;

    public AppModule(App app) {
        mApp = app;
    }

    @Provides
    @Singleton
    @ApplicationContext
    public Context provideApplicationContext() {
        return mApp.getApplicationContext();
    }

}
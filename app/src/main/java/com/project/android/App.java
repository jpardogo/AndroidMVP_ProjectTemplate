package com.project.android;

import android.app.Application;
import android.content.Context;

import com.project.android.dagger.components.AppComponent;
import com.project.android.dagger.components.DaggerAppComponent;
import com.project.android.dagger.modules.AppModule;

import timber.log.Timber;

public class App extends Application {

    private AppComponent mAppcomponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
        planTimber();
    }

    private void planTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    private void setupGraph() {
        if (mAppcomponent == null) {
            mAppcomponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
            mAppcomponent.inject(this);
        }
    }

    public AppComponent component() {
        return mAppcomponent;
    }

    public static App get(Context context) {
        return ((App) context.getApplicationContext());
    }
}

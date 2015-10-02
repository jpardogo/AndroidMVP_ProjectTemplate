package com.trips.mochilo;

import android.app.Application;
import android.content.Context;

import com.trips.mochilo.ui.dagger.components.AppComponent;
import com.trips.mochilo.ui.dagger.components.DaggerAppComponent;
import com.trips.mochilo.ui.dagger.modules.AppModule;

import net.danlew.android.joda.JodaTimeAndroid;

import timber.log.Timber;

public class Mochilo extends Application {

    private AppComponent mAppcomponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
        JodaTimeAndroid.init(this);
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

    public static Mochilo get(Context context) {
        return ((Mochilo) context.getApplicationContext());
    }
}

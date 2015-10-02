package com.trips.mochilo.ui.activity.main;

import com.trips.mochilo.ui.dagger.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private MainView mView;

    public MainModule(MainView view) {
        this.mView = view;
    }

    @Provides
    @ActivityScope
    public MainView provideActivityView() {
        return mView;
    }

    @Provides
    @ActivityScope
    public MainPresenter provideActivityPresenter(MainView view) {
        return new MainPresenterImpl(view);
    }
}

package com.project.android.presentation.activity.main;

import com.project.android.dagger.ActivityScope;
import com.project.android.data.ExampleInteractor;
import com.project.android.presentation.fragments.example.ExampleFragmentContract;
import com.project.android.presentation.fragments.example.ExampleFragmentPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private MainActivityContract.MainView mView;

    public MainModule(MainActivityContract.MainView view) {
        this.mView = view;
    }

    @Provides
    @ActivityScope
    public MainActivityContract.MainView provideActivityView() {
        return mView;
    }

    @Provides
    @ActivityScope
    public MainActivityContract.MainPresenter provideActivityPresenter(MainActivityContract.MainView view, ExampleInteractor exampleInteractor) {
        return new MainPresenterImpl(view, exampleInteractor);
    }

    //Fragment in Main

    @Provides
    @ActivityScope
    public ExampleFragmentContract.ExampleFragmentPresenter provideExampleFragmentPresenter() {
        return new ExampleFragmentPresenterImpl();
    }


}

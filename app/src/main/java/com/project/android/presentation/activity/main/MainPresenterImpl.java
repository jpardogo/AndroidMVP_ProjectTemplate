package com.project.android.presentation.activity.main;

import com.project.android.data.ExampleInteractor;
import com.project.android.presentation.base.BasePresenter;

public class MainPresenterImpl extends BasePresenter<MainActivityContract.MainView> implements MainActivityContract.MainPresenter {

    private final ExampleInteractor mExampleInteractor;

    public MainPresenterImpl(MainActivityContract.MainView view, ExampleInteractor exampleInteractor) {
        mExampleInteractor = exampleInteractor;
        attachView(view);
    }

    @Override
    public void requestSomeData() {
        //Interactors are presentation layer agnostic,
        //so any presenter can use the interactor it need to request
        //the data that the view ask for.
        mExampleInteractor.requestDataToInteractor();
    }

    @Override
    protected void clearSubscriptions() {
        //Tell all our interactor to unsubcribe all RxJava
        // subscriptions because out view is being dettached
        mExampleInteractor.clearSubcriptions();
    }
}

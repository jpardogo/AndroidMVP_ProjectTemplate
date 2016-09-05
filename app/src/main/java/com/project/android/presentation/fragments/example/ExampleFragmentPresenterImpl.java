package com.project.android.presentation.fragments.example;

import com.project.android.presentation.base.BasePresenter;

public class ExampleFragmentPresenterImpl extends BasePresenter<ExampleFragmentContract.ExampleFragmentView> implements ExampleFragmentContract.ExampleFragmentPresenter {


    //Here we would use constructor injection via dagger if needed
    public ExampleFragmentPresenterImpl() {
    }

    @Override
    protected void clearSubscriptions() {

    }
}

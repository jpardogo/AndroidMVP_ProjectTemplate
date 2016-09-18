package com.project.android.presentation.fragments.example;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.project.android.presentation.activity.main.MainComponent;
import com.project.android.presentation.base.BaseFragment;

import javax.inject.Inject;

public class ExampleFragment extends BaseFragment implements ExampleFragmentContract.ExampleFragmentView {

    @Inject
    ExampleFragmentContract.ExampleFragmentPresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getComponent(MainComponent.class).inject(this);
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}

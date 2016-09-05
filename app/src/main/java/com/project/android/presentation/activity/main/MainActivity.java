package com.project.android.presentation.activity.main;

import android.os.Bundle;

import com.project.android.App;
import com.project.android.R;
import com.project.android.presentation.base.BaseActivity;
import com.project.android.presentation.base.BaseFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainActivityContract.MainView, BaseFragment.HasComponent<MainComponent> {

    private MainComponent mMainComponent;
    @Inject
    MainActivityContract.MainPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButterContentView(R.layout.activity_main);
        //Ready to use presenter
        mPresenter.requestSomeData();
    }

    @Override
    protected void injectScopeComponent() {
        mMainComponent = DaggerMainComponent.builder()
                .appComponent(App.get(this).component())
                .mainModule(new MainModule(this))
                .build();
        mMainComponent.inject(this);
    }

    @Override
    public MainComponent getComponent() {
        return mMainComponent;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}

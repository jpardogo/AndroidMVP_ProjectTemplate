package com.project.android.ui.activity.main;

import android.os.Bundle;

import com.project.android.App;
import com.project.android.R;
import com.project.android.ui.activity.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    private MainComponent mMainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButterContentView(R.layout.activity_main);
    }

    @Override
    protected void injectScopeComponent() {
        mMainComponent = DaggerMainComponent.builder()
                .appComponent(App.get(this).component())
                .mainModule(new MainModule(this))
                .build();
        mMainComponent.inject(this);
    }
}

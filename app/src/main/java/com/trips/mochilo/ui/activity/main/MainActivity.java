package com.trips.mochilo.ui.activity.main;

import android.os.Bundle;

import com.trips.mochilo.Mochilo;
import com.trips.mochilo.R;
import com.trips.mochilo.ui.activity.BaseActivity;
import com.trips.mochilo.ui.fragments.DatePickerFragment;

import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainView {

    private MainComponent mMainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButterContentView(R.layout.activity_main);
    }

    @OnClick(R.id.bt)
    public void onClick() {
        DatePickerFragment.newInstance().show(getSupportFragmentManager(), DatePickerFragment.class.getSimpleName());
    }

    @Override
    protected void injectScopeComponent() {
        mMainComponent = DaggerMainComponent.builder()
                .appComponent(Mochilo.get(this).component())
                .mainModule(new MainModule(this))
                .build();
        mMainComponent.inject(this);
    }
}

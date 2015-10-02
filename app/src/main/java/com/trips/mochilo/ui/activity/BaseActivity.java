package com.trips.mochilo.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.trips.mochilo.Mochilo;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Mochilo.get(this).component().inject(this);
    }

    protected abstract void injectScopeComponent();

    protected void setButterContentView(int layout) {
        setContentView(layout);
        ButterKnife.inject(this);
    }
}

package com.project.android.presentation.activity.main;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.project.android.App;
import com.project.android.R;
import com.project.android.presentation.base.BaseActivity;
import com.project.android.presentation.base.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainActivityContract.MainView, BaseFragment.HasComponent<MainComponent> {

    private MainComponent mMainComponent;
    @Inject
    MainActivityContract.MainPresenter mPresenter;
    @BindView(R.id.bt_test)
    Button mButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setButterContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //Ready to use presenter
        mPresenter.requestSomeData();
        //Java 8 lambdas thanks to jack compiler
        mButton.setOnClickListener(v -> {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
        });
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

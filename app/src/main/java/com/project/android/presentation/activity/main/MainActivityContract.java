package com.project.android.presentation.activity.main;

import com.project.android.presentation.base.MvpPresenter;
import com.project.android.presentation.base.MvpView;

public class MainActivityContract {

    interface MainView extends MvpView {
    }

    interface MainPresenter extends MvpPresenter<MainView> {
        void requestSomeData();
    }
}

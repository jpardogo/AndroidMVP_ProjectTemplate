package com.project.android.presentation.fragments.example;

import com.project.android.presentation.base.MvpPresenter;
import com.project.android.presentation.base.MvpView;

public class ExampleFragmentContract {

    interface ExampleFragmentView extends MvpView {
    }

    public interface ExampleFragmentPresenter extends MvpPresenter<ExampleFragmentView> {
    }
}

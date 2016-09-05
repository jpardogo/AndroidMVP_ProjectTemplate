package com.project.android.presentation.base;

/**
 * Presentation layer handle the logic asking data to interactor and providing it to the views.
 * Adding andorid specific code to the presenter should ve avoided.
 * The presenter should be able to be tested with unit test (execute on the development machine (host)).
 */
public interface MvpPresenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}

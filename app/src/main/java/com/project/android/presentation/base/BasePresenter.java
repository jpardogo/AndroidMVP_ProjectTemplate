package com.project.android.presentation.base;

public abstract class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

    private T mView;

    @Override
    public void attachView(T mvpView) {
        mView = mvpView;
    }

    @Override
    public void detachView() {
        clearSubscriptions();
        mView = null;
    }

    protected abstract void clearSubscriptions();

    public T getView() {
        return mView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MvpViewNotAttachedException();
        }
    }

    private boolean isViewAttached() {
        return mView != null;
    }

    private static class MvpViewNotAttachedException extends RuntimeException {
        MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before requesting data to the Presenter");
        }
    }
}
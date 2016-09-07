package com.project.android.presentation.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<T extends MvpView> implements MvpPresenter<T> {

    private T mView;

    private CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    @Override
    public void attachView(T mvpView) {
        mView = mvpView;
    }

    @Override
    public void detachView() {
        mCompositeSubscription.clear();
        mView = null;
    }

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

    protected void addSubscription(Subscription subscription) {
        mCompositeSubscription.add(subscription);
    }

    private static class MvpViewNotAttachedException extends RuntimeException {
        MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before requesting data to the Presenter");
        }
    }
}
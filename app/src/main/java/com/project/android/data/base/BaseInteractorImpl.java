package com.project.android.data.base;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class BaseInteractorImpl {

    private CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    protected void clearSubscriptions() {
        mCompositeSubscription.clear();

    }

    protected void addSubscription(Subscription subscription) {
        mCompositeSubscription.add(subscription);
    }
}

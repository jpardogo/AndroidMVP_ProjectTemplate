package com.project.android.data;

public class ExampleInteractor {
    public void requestDataToInteractor() {
        //Here we add the RxJava subcription to our CompositeSubscription in the BaseInteractor

        //Using RxJava + Retrofit we can call the a RetrofitRestService to get data from an API
        //We add subcription to CompositeSubscription and we clear them when presenter tell us to.
        //Using RxJava + Realm we can get data from DataBase

        //There are difference techniques where we can choose, cache, network, database
        //read: http://blog.danlew.net/2015/06/22/loading-data-from-multiple-sources-with-rxjava/
        //all of them can be well manage via RxJava, Retrofit and Realm

        //They also provide easy way for mocking and testing
    }
}

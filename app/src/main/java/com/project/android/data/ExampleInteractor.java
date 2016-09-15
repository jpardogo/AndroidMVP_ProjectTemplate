package com.project.android.data;

public class ExampleInteractor {
    public void requestDataToInteractor() {

        //Using RxJava + Retrofit we can call the a RetrofitRestService to get data from an API
        //We return the subcription to the presenter
        //Using RxJava + Realm we can get data from DataBase

        //There are difference techniques where we can choose, cache, network, database
        //read: http://blog.danlew.net/2015/06/22/loading-data-from-multiple-sources-with-rxjava/
        //all of them can be well manage via RxJava, Retrofit and Realm

        //Follow this technique provide for easy mocking and testing in unit test
    }
}

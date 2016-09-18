package com.project.android.data;

import com.project.android.data.remote.model.ExampleModel;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ExampleInteractor {

//    Inject retorfit service via dagger
//    private final ExampleRestService mExampleRestService;


    public Observable<ExampleModel> requestDataToInteractor() {
        //Using RxJava + Retrofit we can call the a RetrofitRestService to get data from an API
        //We return the subcription to the presenter
        //Using RxJava + Realm we can get data from DataBase

//        return Observable.defer(() -> mExampleRestService.getWhatever()
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io()));
        return Observable.just(new ExampleModel())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }
}

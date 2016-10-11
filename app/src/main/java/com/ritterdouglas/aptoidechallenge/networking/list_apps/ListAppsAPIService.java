package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import android.content.Context;
import android.util.Log;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class ListAppsAPIService {
    public static final String TAG = ListAppsAPIService.class.getSimpleName();
    private ListAppsAPI ListAppsAPI;
    private boolean isRequesting;
    private Context context;

    public ListAppsAPIService(Retrofit retrofit, Context context) {
        this.ListAppsAPI = retrofit.create(ListAppsAPI.class);
        this.context = context;
    }

    public ListAppsAPI getListAppsAPI() {
        return ListAppsAPI;
    }

    public void setListAppsAPI(ListAppsAPI listAppsAPI) {
        this.ListAppsAPI = listAppsAPI;
    }

    public boolean isRequesting() {
        return isRequesting;
    }

    public void setRequesting(boolean requesting) {
        isRequesting = requesting;
    }

    public Observable<Response<ListAppsResponse>> listApps() {
        return ListAppsAPI.listApps()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(() -> isRequesting = true)
                .doOnTerminate(() -> isRequesting = false)
                .doOnError(this::onError)
                .doOnNext(listAppsResponse -> processListAppsResponse(listAppsResponse));
    }

    public void onError(Throwable throwable) {
        Log.e(TAG, "onError");
        if (throwable instanceof HttpException) {
            // We had non-2XX http error
            Log.e(TAG, "HTTPException: "+((HttpException)throwable).code());
        }
        if (throwable instanceof IOException) {
            // A network or conversion error happened
            Log.e(TAG, "IOException: "+ throwable.getMessage());
        }
    }


    private void processListAppsResponse(Response<ListAppsResponse> searchResponse) {
        if (searchResponse.body() != null && searchResponse.body() != null) {

        }

        Log.d(TAG, "processListAppsResponse");
        Log.d(TAG, "response code: " + searchResponse.code());


    }

}

package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import android.content.Context;
import android.util.Log;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class AppDetailAPIService {
    public static final String TAG = AppDetailAPIService.class.getSimpleName();
    private AppDetailAPI appDetailAPI;
    private boolean isRequesting;
    private Context context;

    public AppDetailAPIService(Retrofit retrofit, Context context) {
        this.appDetailAPI = retrofit.create(AppDetailAPI.class);
        this.context = context;
    }

    public AppDetailAPI getAppDetailAPI() {
        return appDetailAPI;
    }

    public void setAppDetailAPI(AppDetailAPI appDetailAPI) {
        this.appDetailAPI = appDetailAPI;
    }

    public boolean isRequesting() {
        return isRequesting;
    }

    public void setRequesting(boolean requesting) {
        isRequesting = requesting;
    }

    public Observable<Response<DetailResponse>> getAppDetail(int id) {
        return appDetailAPI.getAppDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(() -> isRequesting = true)
                .doOnTerminate(() -> isRequesting = false)
                .doOnError(this::onError)
                .doOnNext(appDetailResponse -> processAppDetailResponse(appDetailResponse));
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


    private void processAppDetailResponse(Response<DetailResponse> searchResponse) {
        if (searchResponse.body() != null && searchResponse.body() != null) {

        }

        Log.d(TAG, "processAppDetailResponse");
        Log.d(TAG, "response code: " + searchResponse.code());


    }

}

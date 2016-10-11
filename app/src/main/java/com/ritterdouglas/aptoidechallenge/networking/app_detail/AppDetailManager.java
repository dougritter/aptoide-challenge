package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import android.content.Context;

import com.ritterdouglas.aptoidechallenge.networking.RestAdapterFactory;

import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;

public class AppDetailManager {
    private static AppDetailManager instance;
    private AppDetailAPIService appDetailAPIService;

    private AppDetailManager(Context context) {
        Retrofit retrofit = RestAdapterFactory.getAdapter();
        this.appDetailAPIService = new AppDetailAPIService(retrofit, context);

    }

    public static AppDetailManager getInstance(Context context) {
        synchronized (AppDetailManager.class) {
            if (instance == null) {
                instance = new AppDetailManager(context);
            }
            return instance;
        }
    }

    public Observable<Response<DetailResponse>> getAppDetail(int id) {
        return appDetailAPIService.getAppDetail(id);
    }

}
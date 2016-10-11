package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import android.app.SearchManager;
import android.content.Context;

import com.ritterdouglas.aptoidechallenge.networking.RestAdapterFactory;

import retrofit2.Response;
import retrofit2.Retrofit;
import rx.Observable;

public class ListAppsManager {
    private static ListAppsManager instance;
    private ListAppsAPIService listAppsAPIService;

    private ListAppsManager(Context context) {
        Retrofit retrofit = RestAdapterFactory.getAdapter();
        this.listAppsAPIService = new ListAppsAPIService(retrofit, context);

    }

    public static ListAppsManager getInstance(Context context) {
        synchronized (ListAppsManager.class) {
            if (instance == null) {
                instance = new ListAppsManager(context);
            }
            return instance;
        }
    }

    public Observable<Response<ListAppsResponse>> listApps() {
        return listAppsAPIService.listApps();
    }

}
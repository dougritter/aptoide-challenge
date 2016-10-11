package com.ritterdouglas.aptoidechallenge.view_model;

import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsManager;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsResponse;

import retrofit2.Response;
import rx.subjects.AsyncSubject;

public class MainActivityViewModel {

    private AsyncSubject<Response<ListAppsResponse>> listAppsSubject;
    private ListAppsManager listAppsManager;

    public MainActivityViewModel(ListAppsManager searchManager) {
        this.listAppsManager = searchManager;
        listAppsSubject = AsyncSubject.create();
    }

    public void listApps() {
        listAppsManager.listApps()
                .subscribe(listAppsSubject);
    }

    public AsyncSubject<Response<ListAppsResponse>> getListAppsSubject() {
        return this.listAppsSubject;
    }

    public AsyncSubject<Response<ListAppsResponse>> createListAppsSubject() {
        this.listAppsSubject = AsyncSubject.create();
        return this.listAppsSubject;
    }
}
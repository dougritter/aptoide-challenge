package com.ritterdouglas.aptoidechallenge.view_model;

import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsManager;

import rx.subjects.AsyncSubject;

public class MainActivityViewModel {

    private AsyncSubject<Object> listAppsSubject;
    private ListAppsManager searchManager;

    public MainActivityViewModel(ListAppsManager searchManager) {
        this.searchManager = searchManager;
        listAppsSubject = AsyncSubject.create();
    }

    public void listApps() {
        searchManager.listApps()
                .subscribe(listAppsSubject);

    }

    public AsyncSubject<Object> getListAppsSubject() {
        return this.listAppsSubject;
    }

    public AsyncSubject<Object> createSearchSubject() {
        this.listAppsSubject = AsyncSubject.create();
        return this.listAppsSubject;
    }
}
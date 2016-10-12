package com.ritterdouglas.aptoidechallenge.view_model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

import com.ritterdouglas.aptoidechallenge.networking.app_detail.AppDetailManager;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.DetailResponse;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.List;

import java.util.ArrayList;

import retrofit2.Response;
import rx.subjects.AsyncSubject;

public class DetailsActivityViewModel {

    public static final String APP_ID = "app_id";

    private AsyncSubject<Response<DetailResponse>> appDetailsSubject;
    private AppDetailManager appDetailManager;
    private int appID;

    public DetailsActivityViewModel(AppDetailManager appDetailManager, Intent intent) {
        this.appDetailManager = appDetailManager;
        appDetailsSubject = AsyncSubject.create();
        setAppID(intent);
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(Intent intent) {
        this.appID = intent.getExtras().getInt(APP_ID, -1);
    }

    public void getAppDetail(int id) {
        appDetailManager.getAppDetail(id)
                .subscribe(appDetailsSubject);
    }

    public AsyncSubject<Response<DetailResponse>> getAppDetailSubject() {
        return this.appDetailsSubject;
    }

    public AsyncSubject<Response<DetailResponse>> createAppDetailSubject() {
        this.appDetailsSubject = AsyncSubject.create();
        return this.appDetailsSubject;
    }

}

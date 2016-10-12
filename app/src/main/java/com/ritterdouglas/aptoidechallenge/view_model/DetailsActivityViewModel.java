package com.ritterdouglas.aptoidechallenge.view_model;

import android.content.Intent;

import com.ritterdouglas.aptoidechallenge.networking.app_detail.AppDetailManager;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.DetailResponse;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.Meta;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.Versions;
import com.ritterdouglas.aptoidechallenge.view_model.custom_data.DetailsLeanData;

import java.util.ArrayList;

import retrofit2.Response;
import rx.subjects.AsyncSubject;

public class DetailsActivityViewModel {

    public static final String APP_ID = "app_id";
    public static final String APP_NAME = "app_name";

    private AsyncSubject<Response<DetailResponse>> appDetailsSubject;
    private AppDetailManager appDetailManager;
    private int appID;
    private String appName;

    public DetailsActivityViewModel(AppDetailManager appDetailManager, Intent intent) {
        this.appDetailManager = appDetailManager;
        appDetailsSubject = AsyncSubject.create();
        setAppID(intent);
        setAppName(intent);
    }

    public int getAppID() {
        return appID;
    }

    public void setAppID(Intent intent) {
        this.appID = intent.getExtras().getInt(APP_ID, -1);
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(Intent intent) {
        this.appName = intent.getExtras().getString(APP_NAME);
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

    public java.util.List<FragmentDetailViewModel> getViewModelsDataset(Response<DetailResponse> response) {
        Meta meta = response.body().getNodes().getMeta();
        Versions versions = response.body().getNodes().getVersions();

        java.util.List<FragmentDetailViewModel> detailsDataset = new ArrayList<>();

        DetailsLeanData firstObject = new DetailsLeanData();
        firstObject.setIcon(meta.getData().getIcon());
        firstObject.setName(meta.getData().getName());
        firstObject.setDeveloperName(meta.getData().getDeveloper().getName());
        firstObject.setVersionName(meta.getData().getFile().getVername());
        firstObject.setDescription(meta.getData().getMedia().getDescription());

        detailsDataset.add(new FragmentDetailViewModel(firstObject));

        for (int i = 0; i < versions.getList().size(); i++) {
            DetailsLeanData item = new DetailsLeanData();
            item.setIcon(meta.getData().getIcon());
            item.setName(versions.getList().get(i).getName());
            item.setDeveloperName(meta.getData().getDeveloper().getName());
            item.setVersionName(versions.getList().get(i).getFile().getVername());
            item.setDescription(meta.getData().getMedia().getDescription());

            detailsDataset.add(new FragmentDetailViewModel(item));

        }

        return detailsDataset;
    }

}

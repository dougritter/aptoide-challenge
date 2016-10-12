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

    public static class DetailsLeanData implements Parcelable {
        String icon, developerName, description, name, versionName;

        public String getIcon() {
            return icon;
        }

        public String getDeveloperName() {
            return developerName;
        }

        public String getDescription() {
            return description;
        }

        public String getName() {
            return name;
        }

        public String getVersionName() {
            return versionName;
        }


        @Override public int describeContents() {
            return 0;
        }

        @Override public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.icon);
            dest.writeString(this.developerName);
            dest.writeString(this.description);
            dest.writeString(this.name);
            dest.writeString(this.versionName);
        }

        public DetailsLeanData() {}

        protected DetailsLeanData(Parcel in) {
            this.icon = in.readString();
            this.developerName = in.readString();
            this.description = in.readString();
            this.name = in.readString();
            this.versionName = in.readString();
        }

        public static final Parcelable.Creator<DetailsLeanData> CREATOR = new Parcelable.Creator<DetailsLeanData>() {
            @Override
            public DetailsLeanData createFromParcel(Parcel source) {
                return new DetailsLeanData(source);
            }

            @Override
            public DetailsLeanData[] newArray(int size) {
                return new DetailsLeanData[size];
            }
        };
    }

}

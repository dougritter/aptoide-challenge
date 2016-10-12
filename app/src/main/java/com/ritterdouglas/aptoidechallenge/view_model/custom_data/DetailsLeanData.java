
package com.ritterdouglas.aptoidechallenge.view_model.custom_data;

import android.os.Parcel;
import android.os.Parcelable;

public class DetailsLeanData implements Parcelable {
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

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.icon);
        dest.writeString(this.developerName);
        dest.writeString(this.description);
        dest.writeString(this.name);
        dest.writeString(this.versionName);
    }

    public DetailsLeanData() {
    }

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
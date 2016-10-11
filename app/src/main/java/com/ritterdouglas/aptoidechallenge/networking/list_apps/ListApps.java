
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ListApps {

    @SerializedName("datasets")
    private Datasets mDatasets;
    @SerializedName("info")
    private Info mInfo;

    public Datasets getDatasets() {
        return mDatasets;
    }

    public void setDatasets(Datasets datasets) {
        mDatasets = datasets;
    }

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

}

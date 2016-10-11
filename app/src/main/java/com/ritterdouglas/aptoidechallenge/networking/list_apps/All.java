
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class All {

    @SerializedName("data")
    private Data mData;
    @SerializedName("info")
    private Info mInfo;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

}


package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Versions {

    @SerializedName("info")
    private Info mInfo;
    @SerializedName("list")
    private java.util.List<com.ritterdouglas.aptoidechallenge.networking.app_detail.List> mList;

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

    public java.util.List<com.ritterdouglas.aptoidechallenge.networking.app_detail.List> getList() {
        return mList;
    }

    public void setList(java.util.List<com.ritterdouglas.aptoidechallenge.networking.app_detail.List> list) {
        mList = list;
    }

}

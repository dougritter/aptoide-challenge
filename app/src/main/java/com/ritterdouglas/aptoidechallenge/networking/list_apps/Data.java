
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("hidden")
    private Long mHidden;
    @SerializedName("limit")
    private Long mLimit;
    @SerializedName("list")
    private java.util.List<com.ritterdouglas.aptoidechallenge.networking.list_apps.List> mList;
    @SerializedName("next")
    private Long mNext;
    @SerializedName("offset")
    private Long mOffset;
    @SerializedName("total")
    private Long mTotal;

    public Long getHidden() {
        return mHidden;
    }

    public void setHidden(Long hidden) {
        mHidden = hidden;
    }

    public Long getLimit() {
        return mLimit;
    }

    public void setLimit(Long limit) {
        mLimit = limit;
    }

    public java.util.List<com.ritterdouglas.aptoidechallenge.networking.list_apps.List> getList() {
        return mList;
    }

    public void setList(java.util.List<com.ritterdouglas.aptoidechallenge.networking.list_apps.List> list) {
        mList = list;
    }

    public Long getNext() {
        return mNext;
    }

    public void setNext(Long next) {
        mNext = next;
    }

    public Long getOffset() {
        return mOffset;
    }

    public void setOffset(Long offset) {
        mOffset = offset;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}

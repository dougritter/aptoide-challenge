
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class List {

    @SerializedName("added")
    private String mAdded;
    @SerializedName("apk_tags")
    private java.util.List<Object> mApkTags;
    @SerializedName("downloads")
    private Long mDownloads;
    @SerializedName("graphic")
    private Object mGraphic;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private Long mId;
    @SerializedName("md5sum")
    private String mMd5sum;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("name")
    private String mName;
    @SerializedName("package")
    private String mPackage;
    @SerializedName("rating")
    private Double mRating;
    @SerializedName("size")
    private Long mSize;
    @SerializedName("store_id")
    private Long mStoreId;
    @SerializedName("store_name")
    private String mStoreName;
    @SerializedName("updated")
    private String mUpdated;
    @SerializedName("uptype")
    private String mUptype;
    @SerializedName("vercode")
    private Long mVercode;
    @SerializedName("vername")
    private String mVername;

    public String getAdded() {
        return mAdded;
    }

    public void setAdded(String added) {
        mAdded = added;
    }

    public java.util.List<Object> getApkTags() {
        return mApkTags;
    }

    public void setApkTags(java.util.List<Object> apk_tags) {
        mApkTags = apk_tags;
    }

    public Long getDownloads() {
        return mDownloads;
    }

    public void setDownloads(Long downloads) {
        mDownloads = downloads;
    }

    public Object getGraphic() {
        return mGraphic;
    }

    public void setGraphic(Object graphic) {
        mGraphic = graphic;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getMd5sum() {
        return mMd5sum;
    }

    public void setMd5sum(String md5sum) {
        mMd5sum = md5sum;
    }

    public String getModified() {
        return mModified;
    }

    public void setModified(String modified) {
        mModified = modified;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPackage() {
        return mPackage;
    }

    public void setPackage(String package_) {
        mPackage = package_;
    }

    public Double getRating() {
        return mRating;
    }

    public void setRating(Double rating) {
        mRating = rating;
    }

    public Long getSize() {
        return mSize;
    }

    public void setSize(Long size) {
        mSize = size;
    }

    public Long getStoreId() {
        return mStoreId;
    }

    public void setStoreId(Long store_id) {
        mStoreId = store_id;
    }

    public String getStoreName() {
        return mStoreName;
    }

    public void setStoreName(String store_name) {
        mStoreName = store_name;
    }

    public String getUpdated() {
        return mUpdated;
    }

    public void setUpdated(String updated) {
        mUpdated = updated;
    }

    public String getUptype() {
        return mUptype;
    }

    public void setUptype(String uptype) {
        mUptype = uptype;
    }

    public Long getVercode() {
        return mVercode;
    }

    public void setVercode(Long vercode) {
        mVercode = vercode;
    }

    public String getVername() {
        return mVername;
    }

    public void setVername(String vername) {
        mVername = vername;
    }

}

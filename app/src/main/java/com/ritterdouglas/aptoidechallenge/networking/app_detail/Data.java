
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Data {

    @SerializedName("added")
    private String mAdded;
    @SerializedName("developer")
    private Developer mDeveloper;
    @SerializedName("file")
    private File mFile;
    @SerializedName("graphic")
    private Object mGraphic;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private Long mId;
    @SerializedName("media")
    private Media mMedia;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("name")
    private String mName;
    @SerializedName("obb")
    private Object mObb;
    @SerializedName("package")
    private String mPackage;
    @SerializedName("pay")
    private Object mPay;
    @SerializedName("size")
    private Long mSize;
    @SerializedName("stats")
    private Stats mStats;
    @SerializedName("store")
    private Store mStore;
    @SerializedName("urls")
    private Urls mUrls;

    public String getAdded() {
        return mAdded;
    }

    public void setAdded(String added) {
        mAdded = added;
    }

    public Developer getDeveloper() {
        return mDeveloper;
    }

    public void setDeveloper(Developer developer) {
        mDeveloper = developer;
    }

    public File getFile() {
        return mFile;
    }

    public void setFile(File file) {
        mFile = file;
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

    public Media getMedia() {
        return mMedia;
    }

    public void setMedia(Media media) {
        mMedia = media;
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

    public Object getObb() {
        return mObb;
    }

    public void setObb(Object obb) {
        mObb = obb;
    }

    public String getPackage() {
        return mPackage;
    }

    public void setPackage(String package) {
        mPackage = package;
    }

    public Object getPay() {
        return mPay;
    }

    public void setPay(Object pay) {
        mPay = pay;
    }

    public Long getSize() {
        return mSize;
    }

    public void setSize(Long size) {
        mSize = size;
    }

    public Stats getStats() {
        return mStats;
    }

    public void setStats(Stats stats) {
        mStats = stats;
    }

    public Store getStore() {
        return mStore;
    }

    public void setStore(Store store) {
        mStore = store;
    }

    public Urls getUrls() {
        return mUrls;
    }

    public void setUrls(Urls urls) {
        mUrls = urls;
    }

}

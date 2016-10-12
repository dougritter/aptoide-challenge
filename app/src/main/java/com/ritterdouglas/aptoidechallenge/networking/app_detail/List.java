
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class List {

    @SerializedName("added")
    private String mAdded;
    @SerializedName("file")
    private File mFile;
    @SerializedName("graphic")
    private Object mGraphic;
    @SerializedName("icon")
    private String mIcon;
    @SerializedName("id")
    private Long mId;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("name")
    private String mName;
    @SerializedName("package")
    private String mPackage;
    @SerializedName("size")
    private Long mSize;
    @SerializedName("stats")
    private Stats mStats;
    @SerializedName("store")
    private Store mStore;
    @SerializedName("updated")
    private String mUpdated;
    @SerializedName("uptype")
    private String mUptype;

    public String getAdded() {
        return mAdded;
    }

    public void setAdded(String added) {
        mAdded = added;
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

}

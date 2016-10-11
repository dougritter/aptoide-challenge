
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Stats {

    @SerializedName("apps")
    private Long mApps;
    @SerializedName("downloads")
    private Long mDownloads;
    @SerializedName("pdownloads")
    private Long mPdownloads;
    @SerializedName("rating")
    private Rating mRating;
    @SerializedName("subscribers")
    private Long mSubscribers;

    public Long getApps() {
        return mApps;
    }

    public void setApps(Long apps) {
        mApps = apps;
    }

    public Long getDownloads() {
        return mDownloads;
    }

    public void setDownloads(Long downloads) {
        mDownloads = downloads;
    }

    public Long getPdownloads() {
        return mPdownloads;
    }

    public void setPdownloads(Long pdownloads) {
        mPdownloads = pdownloads;
    }

    public Rating getRating() {
        return mRating;
    }

    public void setRating(Rating rating) {
        mRating = rating;
    }

    public Long getSubscribers() {
        return mSubscribers;
    }

    public void setSubscribers(Long subscribers) {
        mSubscribers = subscribers;
    }

}

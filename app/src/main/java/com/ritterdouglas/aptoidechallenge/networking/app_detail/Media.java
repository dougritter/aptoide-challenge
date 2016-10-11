
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Media {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("keywords")
    private List<String> mKeywords;
    @SerializedName("news")
    private String mNews;
    @SerializedName("screenshots")
    private List<Screenshot> mScreenshots;
    @SerializedName("videos")
    private List<Video> mVideos;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public List<String> getKeywords() {
        return mKeywords;
    }

    public void setKeywords(List<String> keywords) {
        mKeywords = keywords;
    }

    public String getNews() {
        return mNews;
    }

    public void setNews(String news) {
        mNews = news;
    }

    public List<Screenshot> getScreenshots() {
        return mScreenshots;
    }

    public void setScreenshots(List<Screenshot> screenshots) {
        mScreenshots = screenshots;
    }

    public List<Video> getVideos() {
        return mVideos;
    }

    public void setVideos(List<Video> videos) {
        mVideos = videos;
    }

}

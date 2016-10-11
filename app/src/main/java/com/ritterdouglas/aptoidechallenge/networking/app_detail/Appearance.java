
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Appearance {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("theme")
    private String mTheme;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getTheme() {
        return mTheme;
    }

    public void setTheme(String theme) {
        mTheme = theme;
    }

}

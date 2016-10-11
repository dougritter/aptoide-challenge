
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Time {

    @SerializedName("human")
    private String mHuman;
    @SerializedName("seconds")
    private Double mSeconds;

    public String getHuman() {
        return mHuman;
    }

    public void setHuman(String human) {
        mHuman = human;
    }

    public Double getSeconds() {
        return mSeconds;
    }

    public void setSeconds(Double seconds) {
        mSeconds = seconds;
    }

}

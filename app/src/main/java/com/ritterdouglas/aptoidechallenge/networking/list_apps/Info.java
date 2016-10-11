
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Info {

    @SerializedName("status")
    private String mStatus;
    @SerializedName("time")
    private Time mTime;

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public Time getTime() {
        return mTime;
    }

    public void setTime(Time time) {
        mTime = time;
    }

}

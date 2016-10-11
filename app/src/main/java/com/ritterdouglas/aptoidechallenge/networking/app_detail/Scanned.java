
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Scanned {

    @SerializedName("av_info")
    private List<AvInfo> mAvInfo;
    @SerializedName("date")
    private String mDate;
    @SerializedName("status")
    private String mStatus;

    public List<AvInfo> getAvInfo() {
        return mAvInfo;
    }

    public void setAvInfo(List<AvInfo> av_info) {
        mAvInfo = av_info;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}

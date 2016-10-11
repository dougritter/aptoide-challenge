
package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ListAppsResponse {

    @SerializedName("responses")
    private Responses mResponses;
    @SerializedName("status")
    private String mStatus;

    public Responses getResponses() {
        return mResponses;
    }

    public void setResponses(Responses responses) {
        mResponses = responses;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}


package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Responses {

    @SerializedName("listApps")
    private ListApps mListApps;

    public ListApps getListApps() {
        return mListApps;
    }

    public void setListApps(ListApps listApps) {
        mListApps = listApps;
    }

}


package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DetailResponse {

    @SerializedName("info")
    private Info mInfo;
    @SerializedName("nodes")
    private Nodes mNodes;

    public Info getInfo() {
        return mInfo;
    }

    public void setInfo(Info info) {
        mInfo = info;
    }

    public Nodes getNodes() {
        return mNodes;
    }

    public void setNodes(Nodes nodes) {
        mNodes = nodes;
    }

}

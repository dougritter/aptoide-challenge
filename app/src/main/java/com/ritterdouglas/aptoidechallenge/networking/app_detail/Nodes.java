
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Nodes {

    @SerializedName("meta")
    private Meta mMeta;
    @SerializedName("versions")
    private Versions mVersions;

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

    public Versions getVersions() {
        return mVersions;
    }

    public void setVersions(Versions versions) {
        mVersions = versions;
    }

}

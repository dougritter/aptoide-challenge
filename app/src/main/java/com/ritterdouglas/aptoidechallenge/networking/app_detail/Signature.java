
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Signature {

    @SerializedName("owner")
    private String mOwner;
    @SerializedName("sha1")
    private String mSha1;

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public String getSha1() {
        return mSha1;
    }

    public void setSha1(String sha1) {
        mSha1 = sha1;
    }

}

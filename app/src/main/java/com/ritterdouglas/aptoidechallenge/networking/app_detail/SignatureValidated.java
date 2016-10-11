
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SignatureValidated {

    @SerializedName("date")
    private String mDate;
    @SerializedName("signature_from")
    private String mSignatureFrom;
    @SerializedName("status")
    private String mStatus;

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getSignatureFrom() {
        return mSignatureFrom;
    }

    public void setSignatureFrom(String signature_from) {
        mSignatureFrom = signature_from;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}


package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Reason {

    @SerializedName("scanned")
    private Scanned mScanned;
    @SerializedName("signature_validated")
    private SignatureValidated mSignatureValidated;

    public Scanned getScanned() {
        return mScanned;
    }

    public void setScanned(Scanned scanned) {
        mScanned = scanned;
    }

    public SignatureValidated getSignatureValidated() {
        return mSignatureValidated;
    }

    public void setSignatureValidated(SignatureValidated signature_validated) {
        mSignatureValidated = signature_validated;
    }

}

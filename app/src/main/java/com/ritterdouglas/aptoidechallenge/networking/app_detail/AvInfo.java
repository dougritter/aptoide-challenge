
package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AvInfo {

    @SerializedName("infections")
    private List<Object> mInfections;
    @SerializedName("name")
    private String mName;

    public List<Object> getInfections() {
        return mInfections;
    }

    public void setInfections(List<Object> infections) {
        mInfections = infections;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}

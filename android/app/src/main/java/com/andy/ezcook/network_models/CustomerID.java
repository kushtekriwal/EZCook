
package com.andy.ezcook.network_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerID {

    public CustomerID(String value) {
        this.value = value;
    }

    @SerializedName("value")
    @Expose

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

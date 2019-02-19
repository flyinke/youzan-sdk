package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressGetParams;

public class YouzanUserAddressGet extends AbstractAPI {

    public YouzanUserAddressGet() {
    }

    public YouzanUserAddressGet(YouzanUserAddressGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.user.address.get";
    }

    public Class getResultModelClass() {
        return YouzanUserAddressGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUserAddressGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
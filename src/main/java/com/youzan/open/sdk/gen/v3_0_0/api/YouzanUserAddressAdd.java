package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressAddParams;

public class YouzanUserAddressAdd extends AbstractAPI {

    public YouzanUserAddressAdd() {
    }

    public YouzanUserAddressAdd(YouzanUserAddressAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.user.address.add";
    }

    public Class getResultModelClass() {
        return YouzanUserAddressAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUserAddressAddParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
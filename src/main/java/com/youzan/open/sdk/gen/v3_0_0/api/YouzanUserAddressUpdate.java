package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserAddressUpdateParams;

public class YouzanUserAddressUpdate extends AbstractAPI {

    public YouzanUserAddressUpdate() {
    }

    public YouzanUserAddressUpdate(YouzanUserAddressUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.user.address.update";
    }

    public Class getResultModelClass() {
        return YouzanUserAddressUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUserAddressUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
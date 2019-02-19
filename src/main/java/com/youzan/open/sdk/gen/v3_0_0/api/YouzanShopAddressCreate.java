package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressCreateParams;

public class YouzanShopAddressCreate extends AbstractAPI {

    public YouzanShopAddressCreate() {
    }

    public YouzanShopAddressCreate(YouzanShopAddressCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.address.create";
    }

    public Class getResultModelClass() {
        return YouzanShopAddressCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopAddressCreateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
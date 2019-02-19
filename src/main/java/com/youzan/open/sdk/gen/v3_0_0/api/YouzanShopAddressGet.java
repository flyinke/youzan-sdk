package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressGetParams;

public class YouzanShopAddressGet extends AbstractAPI {

    public YouzanShopAddressGet() {
    }

    public YouzanShopAddressGet(YouzanShopAddressGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.address.get";
    }

    public Class getResultModelClass() {
        return YouzanShopAddressGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopAddressGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
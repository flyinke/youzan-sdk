package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopGetParams;

public class YouzanShopGet extends AbstractAPI {

    public YouzanShopGet() {
    }

    public YouzanShopGet(YouzanShopGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.get";
    }

    public Class getResultModelClass() {
        return YouzanShopGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
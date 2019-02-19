package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopStatusGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopStatusGetParams;

public class YouzanShopStatusGet extends AbstractAPI {

    public YouzanShopStatusGet() {
    }

    public YouzanShopStatusGet(YouzanShopStatusGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.status.get";
    }

    public Class getResultModelClass() {
        return YouzanShopStatusGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopStatusGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
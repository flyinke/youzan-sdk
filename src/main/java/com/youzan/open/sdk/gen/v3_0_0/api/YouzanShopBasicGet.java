package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopBasicGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopBasicGetParams;

public class YouzanShopBasicGet extends AbstractAPI {

    public YouzanShopBasicGet() {
    }

    public YouzanShopBasicGet(YouzanShopBasicGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.basic.get";
    }

    public Class getResultModelClass() {
        return YouzanShopBasicGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopBasicGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
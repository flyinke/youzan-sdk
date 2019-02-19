package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemGetParams;

public class YouzanItemGet extends AbstractAPI {

    public YouzanItemGet() {
    }

    public YouzanItemGet(YouzanItemGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.get";
    }

    public Class getResultModelClass() {
        return YouzanItemGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
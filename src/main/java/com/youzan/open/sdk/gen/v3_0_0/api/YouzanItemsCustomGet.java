package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsCustomGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsCustomGetParams;

public class YouzanItemsCustomGet extends AbstractAPI {

    public YouzanItemsCustomGet() {
    }

    public YouzanItemsCustomGet(YouzanItemsCustomGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.items.custom.get";
    }

    public Class getResultModelClass() {
        return YouzanItemsCustomGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemsCustomGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
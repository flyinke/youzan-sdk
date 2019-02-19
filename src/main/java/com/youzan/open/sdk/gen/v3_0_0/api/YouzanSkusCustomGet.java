package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSkusCustomGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSkusCustomGetParams;

public class YouzanSkusCustomGet extends AbstractAPI {

    public YouzanSkusCustomGet() {
    }

    public YouzanSkusCustomGet(YouzanSkusCustomGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.skus.custom.get";
    }

    public Class getResultModelClass() {
        return YouzanSkusCustomGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSkusCustomGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
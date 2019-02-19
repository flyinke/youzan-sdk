package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRegionsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRegionsGetParams;

public class YouzanRegionsGet extends AbstractAPI {

    public YouzanRegionsGet() {
    }

    public YouzanRegionsGet(YouzanRegionsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.regions.get";
    }

    public Class getResultModelClass() {
        return YouzanRegionsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRegionsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
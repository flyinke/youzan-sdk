package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardUrlGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardUrlGetParams;

public class YouzanScrmCardUrlGet extends AbstractAPI {

    public YouzanScrmCardUrlGet() {
    }

    public YouzanScrmCardUrlGet(YouzanScrmCardUrlGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.url.get";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardUrlGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardUrlGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
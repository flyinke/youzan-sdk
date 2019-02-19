package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardGetParams;

public class YouzanScrmCardGet extends AbstractAPI {

    public YouzanScrmCardGet() {
    }

    public YouzanScrmCardGet(YouzanScrmCardGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.get";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
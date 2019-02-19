package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardGetParams;

public class YouzanMeiCardGet extends AbstractAPI {

    public YouzanMeiCardGet() {
    }

    public YouzanMeiCardGet(YouzanMeiCardGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
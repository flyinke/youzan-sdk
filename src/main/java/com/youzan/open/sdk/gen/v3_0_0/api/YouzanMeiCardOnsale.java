package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardOnsaleResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardOnsaleParams;

public class YouzanMeiCardOnsale extends AbstractAPI {

    public YouzanMeiCardOnsale() {
    }

    public YouzanMeiCardOnsale(YouzanMeiCardOnsaleParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.onsale";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardOnsaleResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardOnsaleParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
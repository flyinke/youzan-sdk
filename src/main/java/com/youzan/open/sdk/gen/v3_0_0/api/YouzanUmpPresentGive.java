package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentGiveResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentGiveParams;

public class YouzanUmpPresentGive extends AbstractAPI {

    public YouzanUmpPresentGive() {
    }

    public YouzanUmpPresentGive(YouzanUmpPresentGiveParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.present.give";
    }

    public Class getResultModelClass() {
        return YouzanUmpPresentGiveResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPresentGiveParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentsOngoingAllResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentsOngoingAllParams;

public class YouzanUmpPresentsOngoingAll extends AbstractAPI {

    public YouzanUmpPresentsOngoingAll() {
    }

    public YouzanUmpPresentsOngoingAll(YouzanUmpPresentsOngoingAllParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.presents.ongoing.all";
    }

    public Class getResultModelClass() {
        return YouzanUmpPresentsOngoingAllResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPresentsOngoingAllParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
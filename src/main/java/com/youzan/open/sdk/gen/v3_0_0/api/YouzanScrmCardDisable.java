package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardDisableResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardDisableParams;

public class YouzanScrmCardDisable extends AbstractAPI {

    public YouzanScrmCardDisable() {
    }

    public YouzanScrmCardDisable(YouzanScrmCardDisableParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.disable";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardDisableResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardDisableParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardEnableResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardEnableParams;

public class YouzanScrmCardEnable extends AbstractAPI {

    public YouzanScrmCardEnable() {
    }

    public YouzanScrmCardEnable(YouzanScrmCardEnableParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.enable";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardEnableResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardEnableParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
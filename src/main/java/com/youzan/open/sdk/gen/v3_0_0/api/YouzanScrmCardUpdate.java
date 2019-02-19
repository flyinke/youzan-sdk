package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardUpdateParams;

public class YouzanScrmCardUpdate extends AbstractAPI {

    public YouzanScrmCardUpdate() {
    }

    public YouzanScrmCardUpdate(YouzanScrmCardUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.update";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
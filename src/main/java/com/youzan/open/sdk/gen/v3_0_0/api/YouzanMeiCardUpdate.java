package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardUpdateParams;

public class YouzanMeiCardUpdate extends AbstractAPI {

    public YouzanMeiCardUpdate() {
    }

    public YouzanMeiCardUpdate(YouzanMeiCardUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardDeleteParams;

public class YouzanScrmCardDelete extends AbstractAPI {

    public YouzanScrmCardDelete() {
    }

    public YouzanScrmCardDelete(YouzanScrmCardDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.delete";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
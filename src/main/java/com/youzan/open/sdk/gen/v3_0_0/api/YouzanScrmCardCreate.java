package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardCreateParams;

public class YouzanScrmCardCreate extends AbstractAPI {

    public YouzanScrmCardCreate() {
    }

    public YouzanScrmCardCreate(YouzanScrmCardCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.create";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardCreateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
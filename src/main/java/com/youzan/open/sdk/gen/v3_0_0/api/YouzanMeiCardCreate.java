package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardCreateParams;

public class YouzanMeiCardCreate extends AbstractAPI {

    public YouzanMeiCardCreate() {
    }

    public YouzanMeiCardCreate(YouzanMeiCardCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
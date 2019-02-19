package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardDeleteParams;

public class YouzanMeiCardDelete extends AbstractAPI {

    public YouzanMeiCardDelete() {
    }

    public YouzanMeiCardDelete(YouzanMeiCardDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
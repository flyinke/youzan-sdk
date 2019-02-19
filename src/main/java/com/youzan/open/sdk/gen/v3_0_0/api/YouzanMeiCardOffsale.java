package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardOffsaleResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardOffsaleParams;

public class YouzanMeiCardOffsale extends AbstractAPI {

    public YouzanMeiCardOffsale() {
    }

    public YouzanMeiCardOffsale(YouzanMeiCardOffsaleParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.offsale";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardOffsaleResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardOffsaleParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
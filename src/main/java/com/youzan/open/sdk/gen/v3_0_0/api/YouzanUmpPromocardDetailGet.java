package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardDetailGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardDetailGetParams;

public class YouzanUmpPromocardDetailGet extends AbstractAPI {

    public YouzanUmpPromocardDetailGet() {
    }

    public YouzanUmpPromocardDetailGet(YouzanUmpPromocardDetailGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promocard.detail.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromocardDetailGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromocardDetailGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
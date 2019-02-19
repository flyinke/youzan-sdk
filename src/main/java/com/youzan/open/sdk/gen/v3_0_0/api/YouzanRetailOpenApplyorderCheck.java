package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenApplyorderCheckResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenApplyorderCheckParams;

public class YouzanRetailOpenApplyorderCheck extends AbstractAPI {

    public YouzanRetailOpenApplyorderCheck() {
    }

    public YouzanRetailOpenApplyorderCheck(YouzanRetailOpenApplyorderCheckParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.applyorder.check";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenApplyorderCheckResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenApplyorderCheckParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderRefuseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderRefuseParams;

public class YouzanRetailOpenRefundorderRefuse extends AbstractAPI {

    public YouzanRetailOpenRefundorderRefuse() {
    }

    public YouzanRetailOpenRefundorderRefuse(YouzanRetailOpenRefundorderRefuseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.refundorder.refuse";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenRefundorderRefuseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenRefundorderRefuseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
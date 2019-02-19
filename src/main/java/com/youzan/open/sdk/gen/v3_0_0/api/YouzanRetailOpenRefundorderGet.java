package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderGetParams;

public class YouzanRetailOpenRefundorderGet extends AbstractAPI {

    public YouzanRetailOpenRefundorderGet() {
    }

    public YouzanRetailOpenRefundorderGet(YouzanRetailOpenRefundorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.refundorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenRefundorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenRefundorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
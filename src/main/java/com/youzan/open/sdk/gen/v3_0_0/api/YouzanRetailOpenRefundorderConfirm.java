package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderConfirmResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenRefundorderConfirmParams;

public class YouzanRetailOpenRefundorderConfirm extends AbstractAPI {

    public YouzanRetailOpenRefundorderConfirm() {
    }

    public YouzanRetailOpenRefundorderConfirm(YouzanRetailOpenRefundorderConfirmParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.refundorder.confirm";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenRefundorderConfirmResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenRefundorderConfirmParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderConfirmResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderConfirmParams;

public class YouzanRetailOpenReturnorderConfirm extends AbstractAPI {

    public YouzanRetailOpenReturnorderConfirm() {
    }

    public YouzanRetailOpenReturnorderConfirm(YouzanRetailOpenReturnorderConfirmParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.returnorder.confirm";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenReturnorderConfirmResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenReturnorderConfirmParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
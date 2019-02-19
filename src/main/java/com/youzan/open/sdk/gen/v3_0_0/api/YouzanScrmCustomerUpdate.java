package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerUpdateParams;

public class YouzanScrmCustomerUpdate extends AbstractAPI {

    public YouzanScrmCustomerUpdate() {
    }

    public YouzanScrmCustomerUpdate(YouzanScrmCustomerUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.update";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
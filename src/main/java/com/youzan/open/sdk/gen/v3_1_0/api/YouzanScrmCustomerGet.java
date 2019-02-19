package com.youzan.open.sdk.gen.v3_1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_1_0.model.YouzanScrmCustomerGetResult;
import com.youzan.open.sdk.gen.v3_1_0.model.YouzanScrmCustomerGetParams;

public class YouzanScrmCustomerGet extends AbstractAPI {

    public YouzanScrmCustomerGet() {
    }

    public YouzanScrmCustomerGet(YouzanScrmCustomerGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.1.0";
    }

    public String getName() {
        return "youzan.scrm.customer.get";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
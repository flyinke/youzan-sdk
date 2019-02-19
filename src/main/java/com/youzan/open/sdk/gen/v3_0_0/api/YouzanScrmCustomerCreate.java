package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCreateParams;

public class YouzanScrmCustomerCreate extends AbstractAPI {

    public YouzanScrmCustomerCreate() {
    }

    public YouzanScrmCustomerCreate(YouzanScrmCustomerCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.create";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
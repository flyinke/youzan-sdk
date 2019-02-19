package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerCreateParams;

public class YouzanMeiCustomerCreate extends AbstractAPI {

    public YouzanMeiCustomerCreate() {
    }

    public YouzanMeiCustomerCreate(YouzanMeiCustomerCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
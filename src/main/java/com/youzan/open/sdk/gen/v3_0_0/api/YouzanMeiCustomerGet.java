package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerGetParams;

public class YouzanMeiCustomerGet extends AbstractAPI {

    public YouzanMeiCustomerGet() {
    }

    public YouzanMeiCustomerGet(YouzanMeiCustomerGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
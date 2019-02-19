package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerInfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerInfoGetParams;

public class YouzanScrmCustomerInfoGet extends AbstractAPI {

    public YouzanScrmCustomerInfoGet() {
    }

    public YouzanScrmCustomerInfoGet(YouzanScrmCustomerInfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.info.get";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerInfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerInfoGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
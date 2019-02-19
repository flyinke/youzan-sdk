package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSecretfileinfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSecretfileinfoGetParams;

public class YouzanMeiCustomerSecretfileinfoGet extends AbstractAPI {

    public YouzanMeiCustomerSecretfileinfoGet() {
    }

    public YouzanMeiCustomerSecretfileinfoGet(YouzanMeiCustomerSecretfileinfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.secretfileinfo.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerSecretfileinfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerSecretfileinfoGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
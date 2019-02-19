package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFileinfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFileinfoGetParams;

public class YouzanMeiCustomerFileinfoGet extends AbstractAPI {

    public YouzanMeiCustomerFileinfoGet() {
    }

    public YouzanMeiCustomerFileinfoGet(YouzanMeiCustomerFileinfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.fileinfo.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerFileinfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerFileinfoGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
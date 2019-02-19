package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFiletemplateGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFiletemplateGetParams;

public class YouzanMeiCustomerFiletemplateGet extends AbstractAPI {

    public YouzanMeiCustomerFiletemplateGet() {
    }

    public YouzanMeiCustomerFiletemplateGet(YouzanMeiCustomerFiletemplateGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.filetemplate.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerFiletemplateGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerFiletemplateGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
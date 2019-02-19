package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerUpdateParams;

public class YouzanMeiCustomerUpdate extends AbstractAPI {

    public YouzanMeiCustomerUpdate() {
    }

    public YouzanMeiCustomerUpdate(YouzanMeiCustomerUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
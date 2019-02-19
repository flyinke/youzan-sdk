package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerListParams;

public class YouzanMeiCustomerList extends AbstractAPI {

    public YouzanMeiCustomerList() {
    }

    public YouzanMeiCustomerList(YouzanMeiCustomerListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
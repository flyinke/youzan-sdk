package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardCustomerListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardCustomerListParams;

public class YouzanMeiCardCustomerList extends AbstractAPI {

    public YouzanMeiCardCustomerList() {
    }

    public YouzanMeiCardCustomerList(YouzanMeiCardCustomerListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.customer.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardCustomerListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardCustomerListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
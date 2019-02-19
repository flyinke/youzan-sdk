package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerTagListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerTagListParams;

public class YouzanMeiCustomerTagList extends AbstractAPI {

    public YouzanMeiCustomerTagList() {
    }

    public YouzanMeiCustomerTagList(YouzanMeiCustomerTagListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.tag.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerTagListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerTagListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
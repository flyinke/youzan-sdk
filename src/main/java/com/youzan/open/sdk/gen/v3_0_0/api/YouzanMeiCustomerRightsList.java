package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerRightsListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerRightsListParams;

public class YouzanMeiCustomerRightsList extends AbstractAPI {

    public YouzanMeiCustomerRightsList() {
    }

    public YouzanMeiCustomerRightsList(YouzanMeiCustomerRightsListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.rights.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerRightsListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerRightsListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
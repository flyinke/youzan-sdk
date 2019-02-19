package com.youzan.open.sdk.gen.v3_0_1.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsIncreaseResult;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsIncreaseParams;

public class YouzanCrmCustomerPointsIncrease extends AbstractAPI {

    public YouzanCrmCustomerPointsIncrease() {
    }

    public YouzanCrmCustomerPointsIncrease(YouzanCrmCustomerPointsIncreaseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.1";
    }

    public String getName() {
        return "youzan.crm.customer.points.increase";
    }

    public Class getResultModelClass() {
        return YouzanCrmCustomerPointsIncreaseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmCustomerPointsIncreaseParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
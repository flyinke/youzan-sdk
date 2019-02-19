package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerPointsIncreaseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerPointsIncreaseParams;

public class YouzanMeiCustomerPointsIncrease extends AbstractAPI {

    public YouzanMeiCustomerPointsIncrease() {
    }

    public YouzanMeiCustomerPointsIncrease(YouzanMeiCustomerPointsIncreaseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.points.increase";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerPointsIncreaseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerPointsIncreaseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
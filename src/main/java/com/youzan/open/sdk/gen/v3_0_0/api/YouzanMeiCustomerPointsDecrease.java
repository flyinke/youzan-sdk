package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerPointsDecreaseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerPointsDecreaseParams;

public class YouzanMeiCustomerPointsDecrease extends AbstractAPI {

    public YouzanMeiCustomerPointsDecrease() {
    }

    public YouzanMeiCustomerPointsDecrease(YouzanMeiCustomerPointsDecreaseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.points.decrease";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerPointsDecreaseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerPointsDecreaseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
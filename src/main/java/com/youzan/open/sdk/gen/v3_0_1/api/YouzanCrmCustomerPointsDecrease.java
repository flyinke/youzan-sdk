package com.youzan.open.sdk.gen.v3_0_1.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsDecreaseResult;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsDecreaseParams;

public class YouzanCrmCustomerPointsDecrease extends AbstractAPI {

    public YouzanCrmCustomerPointsDecrease() {
    }

    public YouzanCrmCustomerPointsDecrease(YouzanCrmCustomerPointsDecreaseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.1";
    }

    public String getName() {
        return "youzan.crm.customer.points.decrease";
    }

    public Class getResultModelClass() {
        return YouzanCrmCustomerPointsDecreaseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmCustomerPointsDecreaseParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardDeleteParams;

public class YouzanScrmCustomerCardDelete extends AbstractAPI {

    public YouzanScrmCustomerCardDelete() {
    }

    public YouzanScrmCustomerCardDelete(YouzanScrmCustomerCardDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.card.delete";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerCardDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerCardDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
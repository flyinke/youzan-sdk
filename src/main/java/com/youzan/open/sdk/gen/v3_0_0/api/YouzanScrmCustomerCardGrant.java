package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardGrantResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardGrantParams;

public class YouzanScrmCustomerCardGrant extends AbstractAPI {

    public YouzanScrmCustomerCardGrant() {
    }

    public YouzanScrmCustomerCardGrant(YouzanScrmCustomerCardGrantParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.card.grant";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerCardGrantResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerCardGrantParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
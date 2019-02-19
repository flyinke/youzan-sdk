package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardListParams;

public class YouzanScrmCustomerCardList extends AbstractAPI {

    public YouzanScrmCustomerCardList() {
    }

    public YouzanScrmCustomerCardList(YouzanScrmCustomerCardListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.card.list";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerCardListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerCardListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
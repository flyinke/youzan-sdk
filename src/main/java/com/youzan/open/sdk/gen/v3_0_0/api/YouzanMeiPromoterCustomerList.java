package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerListParams;

public class YouzanMeiPromoterCustomerList extends AbstractAPI {

    public YouzanMeiPromoterCustomerList() {
    }

    public YouzanMeiPromoterCustomerList(YouzanMeiPromoterCustomerListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.customer.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterCustomerListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterCustomerListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
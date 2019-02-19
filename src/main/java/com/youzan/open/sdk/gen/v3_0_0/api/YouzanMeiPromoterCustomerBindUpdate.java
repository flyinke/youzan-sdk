package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerBindUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerBindUpdateParams;

public class YouzanMeiPromoterCustomerBindUpdate extends AbstractAPI {

    public YouzanMeiPromoterCustomerBindUpdate() {
    }

    public YouzanMeiPromoterCustomerBindUpdate(YouzanMeiPromoterCustomerBindUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.customer.bind.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterCustomerBindUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterCustomerBindUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
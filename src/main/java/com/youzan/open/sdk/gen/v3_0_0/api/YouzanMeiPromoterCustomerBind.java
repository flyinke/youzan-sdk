package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerBindResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCustomerBindParams;

public class YouzanMeiPromoterCustomerBind extends AbstractAPI {

    public YouzanMeiPromoterCustomerBind() {
    }

    public YouzanMeiPromoterCustomerBind(YouzanMeiPromoterCustomerBindParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.customer.bind";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterCustomerBindResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterCustomerBindParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
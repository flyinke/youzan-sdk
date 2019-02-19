package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerTradeinfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerTradeinfoGetParams;

public class YouzanMeiCustomerTradeinfoGet extends AbstractAPI {

    public YouzanMeiCustomerTradeinfoGet() {
    }

    public YouzanMeiCustomerTradeinfoGet(YouzanMeiCustomerTradeinfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.tradeinfo.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerTradeinfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerTradeinfoGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
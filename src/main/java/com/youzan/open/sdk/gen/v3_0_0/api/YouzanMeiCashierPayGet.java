package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierPayGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierPayGetParams;

public class YouzanMeiCashierPayGet extends AbstractAPI {

    public YouzanMeiCashierPayGet() {
    }

    public YouzanMeiCashierPayGet(YouzanMeiCashierPayGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.cashier.pay.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCashierPayGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCashierPayGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
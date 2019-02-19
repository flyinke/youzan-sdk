package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierPayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierPayParams;

public class YouzanMeiCashierPay extends AbstractAPI {

    public YouzanMeiCashierPay() {
    }

    public YouzanMeiCashierPay(YouzanMeiCashierPayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.cashier.pay";
    }

    public Class getResultModelClass() {
        return YouzanMeiCashierPayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCashierPayParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
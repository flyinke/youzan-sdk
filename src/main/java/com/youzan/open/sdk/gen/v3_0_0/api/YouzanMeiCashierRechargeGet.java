package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierRechargeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierRechargeGetParams;

public class YouzanMeiCashierRechargeGet extends AbstractAPI {

    public YouzanMeiCashierRechargeGet() {
    }

    public YouzanMeiCashierRechargeGet(YouzanMeiCashierRechargeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.cashier.recharge.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCashierRechargeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCashierRechargeGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
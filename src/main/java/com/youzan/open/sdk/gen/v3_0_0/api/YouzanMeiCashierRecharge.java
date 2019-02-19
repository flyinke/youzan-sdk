package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierRechargeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCashierRechargeParams;

public class YouzanMeiCashierRecharge extends AbstractAPI {

    public YouzanMeiCashierRecharge() {
    }

    public YouzanMeiCashierRecharge(YouzanMeiCashierRechargeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.cashier.recharge";
    }

    public Class getResultModelClass() {
        return YouzanMeiCashierRechargeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCashierRechargeParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
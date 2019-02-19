package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillCancelGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillCancelGetParams;

public class YouzanTradeBillCancelGet extends AbstractAPI {

    public YouzanTradeBillCancelGet() {
    }

    public YouzanTradeBillCancelGet(YouzanTradeBillCancelGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.bill.cancel.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeBillCancelGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeBillCancelGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
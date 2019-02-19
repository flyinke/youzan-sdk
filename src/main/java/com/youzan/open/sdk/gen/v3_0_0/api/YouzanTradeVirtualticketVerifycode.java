package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketVerifycodeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketVerifycodeParams;

public class YouzanTradeVirtualticketVerifycode extends AbstractAPI {

    public YouzanTradeVirtualticketVerifycode() {
    }

    public YouzanTradeVirtualticketVerifycode(YouzanTradeVirtualticketVerifycodeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.virtualticket.verifycode";
    }

    public Class getResultModelClass() {
        return YouzanTradeVirtualticketVerifycodeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeVirtualticketVerifycodeParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
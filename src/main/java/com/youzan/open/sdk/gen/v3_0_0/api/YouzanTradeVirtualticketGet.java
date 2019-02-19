package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualticketGetParams;

public class YouzanTradeVirtualticketGet extends AbstractAPI {

    public YouzanTradeVirtualticketGet() {
    }

    public YouzanTradeVirtualticketGet(YouzanTradeVirtualticketGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.virtualticket.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeVirtualticketGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeVirtualticketGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
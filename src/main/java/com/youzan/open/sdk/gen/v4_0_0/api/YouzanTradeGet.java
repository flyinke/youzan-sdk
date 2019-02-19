package com.youzan.open.sdk.gen.v4_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v4_0_0.model.YouzanTradeGetResult;
import com.youzan.open.sdk.gen.v4_0_0.model.YouzanTradeGetParams;

public class YouzanTradeGet extends AbstractAPI {

    public YouzanTradeGet() {
    }

    public YouzanTradeGet(YouzanTradeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "4.0.0";
    }

    public String getName() {
        return "youzan.trade.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
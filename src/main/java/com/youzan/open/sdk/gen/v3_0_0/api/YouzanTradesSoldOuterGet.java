package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradesSoldOuterGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradesSoldOuterGetParams;

public class YouzanTradesSoldOuterGet extends AbstractAPI {

    public YouzanTradesSoldOuterGet() {
    }

    public YouzanTradesSoldOuterGet(YouzanTradesSoldOuterGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trades.sold.outer.get";
    }

    public Class getResultModelClass() {
        return YouzanTradesSoldOuterGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradesSoldOuterGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
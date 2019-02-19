package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradesSoldGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradesSoldGetParams;

public class YouzanTradesSoldGet extends AbstractAPI {

    public YouzanTradesSoldGet() {
    }

    public YouzanTradesSoldGet(YouzanTradesSoldGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trades.sold.get";
    }

    public Class getResultModelClass() {
        return YouzanTradesSoldGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradesSoldGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
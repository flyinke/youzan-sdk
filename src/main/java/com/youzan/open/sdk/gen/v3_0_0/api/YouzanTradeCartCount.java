package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartCountResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartCountParams;

public class YouzanTradeCartCount extends AbstractAPI {

    public YouzanTradeCartCount() {
    }

    public YouzanTradeCartCount(YouzanTradeCartCountParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.count";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartCountResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartCountParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
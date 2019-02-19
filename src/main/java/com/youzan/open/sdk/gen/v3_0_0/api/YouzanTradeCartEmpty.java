package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartEmptyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartEmptyParams;

public class YouzanTradeCartEmpty extends AbstractAPI {

    public YouzanTradeCartEmpty() {
    }

    public YouzanTradeCartEmpty(YouzanTradeCartEmptyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.empty";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartEmptyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartEmptyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartUpdateParams;

public class YouzanTradeCartUpdate extends AbstractAPI {

    public YouzanTradeCartUpdate() {
    }

    public YouzanTradeCartUpdate(YouzanTradeCartUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.update";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
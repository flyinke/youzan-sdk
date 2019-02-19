package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartDeleteParams;

public class YouzanTradeCartDelete extends AbstractAPI {

    public YouzanTradeCartDelete() {
    }

    public YouzanTradeCartDelete(YouzanTradeCartDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.delete";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
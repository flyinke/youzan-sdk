package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartAddParams;

public class YouzanTradeCartAdd extends AbstractAPI {

    public YouzanTradeCartAdd() {
    }

    public YouzanTradeCartAdd(YouzanTradeCartAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.add";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartAddParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
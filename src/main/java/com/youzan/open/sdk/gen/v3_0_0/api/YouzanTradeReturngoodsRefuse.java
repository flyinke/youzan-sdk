package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsRefuseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsRefuseParams;

public class YouzanTradeReturngoodsRefuse extends AbstractAPI {

    public YouzanTradeReturngoodsRefuse() {
    }

    public YouzanTradeReturngoodsRefuse(YouzanTradeReturngoodsRefuseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.returngoods.refuse";
    }

    public Class getResultModelClass() {
        return YouzanTradeReturngoodsRefuseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeReturngoodsRefuseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
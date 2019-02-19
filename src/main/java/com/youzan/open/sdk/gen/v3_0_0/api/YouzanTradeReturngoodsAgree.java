package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsAgreeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsAgreeParams;

public class YouzanTradeReturngoodsAgree extends AbstractAPI {

    public YouzanTradeReturngoodsAgree() {
    }

    public YouzanTradeReturngoodsAgree(YouzanTradeReturngoodsAgreeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.returngoods.agree";
    }

    public Class getResultModelClass() {
        return YouzanTradeReturngoodsAgreeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeReturngoodsAgreeParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
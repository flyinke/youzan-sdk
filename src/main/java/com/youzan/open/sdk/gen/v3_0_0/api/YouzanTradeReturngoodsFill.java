package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsFillResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeReturngoodsFillParams;

public class YouzanTradeReturngoodsFill extends AbstractAPI {

    public YouzanTradeReturngoodsFill() {
    }

    public YouzanTradeReturngoodsFill(YouzanTradeReturngoodsFillParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.returngoods.fill";
    }

    public Class getResultModelClass() {
        return YouzanTradeReturngoodsFillResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeReturngoodsFillParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
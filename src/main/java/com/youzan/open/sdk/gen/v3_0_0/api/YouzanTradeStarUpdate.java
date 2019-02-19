package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeStarUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeStarUpdateParams;

public class YouzanTradeStarUpdate extends AbstractAPI {

    public YouzanTradeStarUpdate() {
    }

    public YouzanTradeStarUpdate(YouzanTradeStarUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.star.update";
    }

    public Class getResultModelClass() {
        return YouzanTradeStarUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeStarUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
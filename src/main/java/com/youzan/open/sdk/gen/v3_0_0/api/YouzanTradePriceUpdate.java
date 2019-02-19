package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradePriceUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradePriceUpdateParams;

public class YouzanTradePriceUpdate extends AbstractAPI {

    public YouzanTradePriceUpdate() {
    }

    public YouzanTradePriceUpdate(YouzanTradePriceUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.price.update";
    }

    public Class getResultModelClass() {
        return YouzanTradePriceUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradePriceUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
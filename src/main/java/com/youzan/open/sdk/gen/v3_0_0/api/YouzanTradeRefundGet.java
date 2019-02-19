package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundGetParams;

public class YouzanTradeRefundGet extends AbstractAPI {

    public YouzanTradeRefundGet() {
    }

    public YouzanTradeRefundGet(YouzanTradeRefundGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
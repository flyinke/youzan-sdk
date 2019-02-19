package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundRefuseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundRefuseParams;

public class YouzanTradeRefundRefuse extends AbstractAPI {

    public YouzanTradeRefundRefuse() {
    }

    public YouzanTradeRefundRefuse(YouzanTradeRefundRefuseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.refuse";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundRefuseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundRefuseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
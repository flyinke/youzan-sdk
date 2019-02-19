package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundInterveneResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundInterveneParams;

public class YouzanTradeRefundIntervene extends AbstractAPI {

    public YouzanTradeRefundIntervene() {
    }

    public YouzanTradeRefundIntervene(YouzanTradeRefundInterveneParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.intervene";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundInterveneResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundInterveneParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
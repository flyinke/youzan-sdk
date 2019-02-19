package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundConditionGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundConditionGetParams;

public class YouzanTradeRefundConditionGet extends AbstractAPI {

    public YouzanTradeRefundConditionGet() {
    }

    public YouzanTradeRefundConditionGet(YouzanTradeRefundConditionGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.condition.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundConditionGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundConditionGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundApplyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundApplyParams;

public class YouzanTradeRefundApply extends AbstractAPI {

    public YouzanTradeRefundApply() {
    }

    public YouzanTradeRefundApply(YouzanTradeRefundApplyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.apply";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundApplyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundApplyParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
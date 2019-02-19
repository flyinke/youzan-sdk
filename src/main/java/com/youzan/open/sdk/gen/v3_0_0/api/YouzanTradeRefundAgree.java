package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundAgreeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundAgreeParams;

public class YouzanTradeRefundAgree extends AbstractAPI {

    public YouzanTradeRefundAgree() {
    }

    public YouzanTradeRefundAgree(YouzanTradeRefundAgreeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.agree";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundAgreeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundAgreeParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
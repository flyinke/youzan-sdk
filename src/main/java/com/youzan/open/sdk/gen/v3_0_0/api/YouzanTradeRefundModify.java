package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundModifyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundModifyParams;

public class YouzanTradeRefundModify extends AbstractAPI {

    public YouzanTradeRefundModify() {
    }

    public YouzanTradeRefundModify(YouzanTradeRefundModifyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.modify";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundModifyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundModifyParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
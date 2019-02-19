package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundMessagesGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundMessagesGetParams;

public class YouzanTradeRefundMessagesGet extends AbstractAPI {

    public YouzanTradeRefundMessagesGet() {
    }

    public YouzanTradeRefundMessagesGet(YouzanTradeRefundMessagesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.messages.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundMessagesGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundMessagesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
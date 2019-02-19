package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundCloseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundCloseParams;

public class YouzanTradeRefundClose extends AbstractAPI {

    public YouzanTradeRefundClose() {
    }

    public YouzanTradeRefundClose(YouzanTradeRefundCloseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.close";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundCloseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundCloseParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
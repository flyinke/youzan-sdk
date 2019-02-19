package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundSellerActiveResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundSellerActiveParams;

public class YouzanTradeRefundSellerActive extends AbstractAPI {

    public YouzanTradeRefundSellerActive() {
    }

    public YouzanTradeRefundSellerActive(YouzanTradeRefundSellerActiveParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.seller.active";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundSellerActiveResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundSellerActiveParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
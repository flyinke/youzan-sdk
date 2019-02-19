package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeRefundSearchParams;

public class YouzanTradeRefundSearch extends AbstractAPI {

    public YouzanTradeRefundSearch() {
    }

    public YouzanTradeRefundSearch(YouzanTradeRefundSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.refund.search";
    }

    public Class getResultModelClass() {
        return YouzanTradeRefundSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeRefundSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
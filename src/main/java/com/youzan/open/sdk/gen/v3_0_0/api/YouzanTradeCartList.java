package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartListParams;

public class YouzanTradeCartList extends AbstractAPI {

    public YouzanTradeCartList() {
    }

    public YouzanTradeCartList(YouzanTradeCartListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.cart.list";
    }

    public Class getResultModelClass() {
        return YouzanTradeCartListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeCartListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
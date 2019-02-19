package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanTradesAccountGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanTradesAccountGetParams;

public class YouzanSalesmanTradesAccountGet extends AbstractAPI {

    public YouzanSalesmanTradesAccountGet() {
    }

    public YouzanSalesmanTradesAccountGet(YouzanSalesmanTradesAccountGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.trades.account.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanTradesAccountGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanTradesAccountGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
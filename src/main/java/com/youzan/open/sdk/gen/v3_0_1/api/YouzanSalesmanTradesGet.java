package com.youzan.open.sdk.gen.v3_0_1.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanSalesmanTradesGetResult;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanSalesmanTradesGetParams;

public class YouzanSalesmanTradesGet extends AbstractAPI {

    public YouzanSalesmanTradesGet() {
    }

    public YouzanSalesmanTradesGet(YouzanSalesmanTradesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.1";
    }

    public String getName() {
        return "youzan.salesman.trades.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanTradesGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanTradesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
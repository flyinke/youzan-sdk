package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockGetParams;

public class YouzanMeiStockGet extends AbstractAPI {

    public YouzanMeiStockGet() {
    }

    public YouzanMeiStockGet(YouzanMeiStockGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.stock.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiStockGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStockGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
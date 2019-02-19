package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockListParams;

public class YouzanMeiStockList extends AbstractAPI {

    public YouzanMeiStockList() {
    }

    public YouzanMeiStockList(YouzanMeiStockListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.stock.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiStockListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStockListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
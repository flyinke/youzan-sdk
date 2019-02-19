package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockWarehouseListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStockWarehouseListParams;

public class YouzanMeiStockWarehouseList extends AbstractAPI {

    public YouzanMeiStockWarehouseList() {
    }

    public YouzanMeiStockWarehouseList(YouzanMeiStockWarehouseListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.stock.warehouse.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiStockWarehouseListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStockWarehouseListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
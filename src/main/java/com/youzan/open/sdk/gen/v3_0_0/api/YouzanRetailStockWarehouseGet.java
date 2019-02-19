package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseGetParams;

public class YouzanRetailStockWarehouseGet extends AbstractAPI {

    public YouzanRetailStockWarehouseGet() {
    }

    public YouzanRetailStockWarehouseGet(YouzanRetailStockWarehouseGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseConfigGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseConfigGetParams;

public class YouzanRetailStockWarehouseConfigGet extends AbstractAPI {

    public YouzanRetailStockWarehouseConfigGet() {
    }

    public YouzanRetailStockWarehouseConfigGet(YouzanRetailStockWarehouseConfigGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.config.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseConfigGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseConfigGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
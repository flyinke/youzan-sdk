package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseConfigSetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseConfigSetParams;

public class YouzanRetailStockWarehouseConfigSet extends AbstractAPI {

    public YouzanRetailStockWarehouseConfigSet() {
    }

    public YouzanRetailStockWarehouseConfigSet(YouzanRetailStockWarehouseConfigSetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.config.set";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseConfigSetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseConfigSetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
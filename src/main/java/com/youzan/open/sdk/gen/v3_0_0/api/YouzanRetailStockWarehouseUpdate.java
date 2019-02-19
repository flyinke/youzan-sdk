package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseUpdateParams;

public class YouzanRetailStockWarehouseUpdate extends AbstractAPI {

    public YouzanRetailStockWarehouseUpdate() {
    }

    public YouzanRetailStockWarehouseUpdate(YouzanRetailStockWarehouseUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
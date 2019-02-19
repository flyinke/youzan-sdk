package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseStatusUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseStatusUpdateParams;

public class YouzanRetailStockWarehouseStatusUpdate extends AbstractAPI {

    public YouzanRetailStockWarehouseStatusUpdate() {
    }

    public YouzanRetailStockWarehouseStatusUpdate(YouzanRetailStockWarehouseStatusUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.status.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseStatusUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseStatusUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseSingleCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseSingleCreateParams;

public class YouzanRetailStockWarehouseSingleCreate extends AbstractAPI {

    public YouzanRetailStockWarehouseSingleCreate() {
    }

    public YouzanRetailStockWarehouseSingleCreate(YouzanRetailStockWarehouseSingleCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.single.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseSingleCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseSingleCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
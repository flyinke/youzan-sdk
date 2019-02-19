package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockWarehouseSearchParams;

public class YouzanRetailStockWarehouseSearch extends AbstractAPI {

    public YouzanRetailStockWarehouseSearch() {
    }

    public YouzanRetailStockWarehouseSearch(YouzanRetailStockWarehouseSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.warehouse.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockWarehouseSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockWarehouseSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
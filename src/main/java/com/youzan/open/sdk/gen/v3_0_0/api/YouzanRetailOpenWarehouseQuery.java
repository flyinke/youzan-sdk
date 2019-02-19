package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenWarehouseQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenWarehouseQueryParams;

public class YouzanRetailOpenWarehouseQuery extends AbstractAPI {

    public YouzanRetailOpenWarehouseQuery() {
    }

    public YouzanRetailOpenWarehouseQuery(YouzanRetailOpenWarehouseQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.warehouse.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenWarehouseQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenWarehouseQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
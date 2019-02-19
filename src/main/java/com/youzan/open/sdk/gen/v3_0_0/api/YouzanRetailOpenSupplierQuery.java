package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierQueryParams;

public class YouzanRetailOpenSupplierQuery extends AbstractAPI {

    public YouzanRetailOpenSupplierQuery() {
    }

    public YouzanRetailOpenSupplierQuery(YouzanRetailOpenSupplierQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.supplier.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSupplierQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSupplierQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
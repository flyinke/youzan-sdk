package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierCreateParams;

public class YouzanRetailOpenSupplierCreate extends AbstractAPI {

    public YouzanRetailOpenSupplierCreate() {
    }

    public YouzanRetailOpenSupplierCreate(YouzanRetailOpenSupplierCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.supplier.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSupplierCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSupplierCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
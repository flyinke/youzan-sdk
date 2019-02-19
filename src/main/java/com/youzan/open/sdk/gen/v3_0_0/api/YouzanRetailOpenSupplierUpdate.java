package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierUpdateParams;

public class YouzanRetailOpenSupplierUpdate extends AbstractAPI {

    public YouzanRetailOpenSupplierUpdate() {
    }

    public YouzanRetailOpenSupplierUpdate(YouzanRetailOpenSupplierUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.supplier.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSupplierUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSupplierUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
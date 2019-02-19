package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSupplierDeleteParams;

public class YouzanRetailOpenSupplierDelete extends AbstractAPI {

    public YouzanRetailOpenSupplierDelete() {
    }

    public YouzanRetailOpenSupplierDelete(YouzanRetailOpenSupplierDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.supplier.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSupplierDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSupplierDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
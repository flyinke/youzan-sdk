package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorCreateParams;

public class YouzanRetailStockVendorCreate extends AbstractAPI {

    public YouzanRetailStockVendorCreate() {
    }

    public YouzanRetailStockVendorCreate(YouzanRetailStockVendorCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.vendor.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockVendorCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockVendorCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
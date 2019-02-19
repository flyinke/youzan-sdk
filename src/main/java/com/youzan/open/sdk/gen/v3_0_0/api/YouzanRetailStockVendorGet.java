package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorGetParams;

public class YouzanRetailStockVendorGet extends AbstractAPI {

    public YouzanRetailStockVendorGet() {
    }

    public YouzanRetailStockVendorGet(YouzanRetailStockVendorGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.vendor.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockVendorGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockVendorGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
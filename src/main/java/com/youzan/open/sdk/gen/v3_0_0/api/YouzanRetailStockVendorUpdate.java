package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorUpdateParams;

public class YouzanRetailStockVendorUpdate extends AbstractAPI {

    public YouzanRetailStockVendorUpdate() {
    }

    public YouzanRetailStockVendorUpdate(YouzanRetailStockVendorUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.vendor.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockVendorUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockVendorUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
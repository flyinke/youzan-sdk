package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockAdjustResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockAdjustParams;

public class YouzanRetailOpenStockAdjust extends AbstractAPI {

    public YouzanRetailOpenStockAdjust() {
    }

    public YouzanRetailOpenStockAdjust(YouzanRetailOpenStockAdjustParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stock.adjust";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockAdjustResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockAdjustParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
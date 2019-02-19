package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockoutGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockoutGetParams;

public class YouzanRetailStockStockoutGet extends AbstractAPI {

    public YouzanRetailStockStockoutGet() {
    }

    public YouzanRetailStockStockoutGet(YouzanRetailStockStockoutGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockout.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockoutGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockoutGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckGetParams;

public class YouzanRetailStockStockcheckGet extends AbstractAPI {

    public YouzanRetailStockStockcheckGet() {
    }

    public YouzanRetailStockStockcheckGet(YouzanRetailStockStockcheckGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockcheck.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockcheckGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockcheckGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
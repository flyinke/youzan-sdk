package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckCreateParams;

public class YouzanRetailStockStockcheckCreate extends AbstractAPI {

    public YouzanRetailStockStockcheckCreate() {
    }

    public YouzanRetailStockStockcheckCreate(YouzanRetailStockStockcheckCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockcheck.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockcheckCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockcheckCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
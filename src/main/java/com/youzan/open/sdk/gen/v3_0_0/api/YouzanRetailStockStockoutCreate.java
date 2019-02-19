package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockoutCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockoutCreateParams;

public class YouzanRetailStockStockoutCreate extends AbstractAPI {

    public YouzanRetailStockStockoutCreate() {
    }

    public YouzanRetailStockStockoutCreate(YouzanRetailStockStockoutCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockout.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockoutCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockoutCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockinCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockinCreateParams;

public class YouzanRetailStockStockinCreate extends AbstractAPI {

    public YouzanRetailStockStockinCreate() {
    }

    public YouzanRetailStockStockinCreate(YouzanRetailStockStockinCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockin.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockinCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockinCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
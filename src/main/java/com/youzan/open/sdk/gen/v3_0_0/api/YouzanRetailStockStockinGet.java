package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockinGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockinGetParams;

public class YouzanRetailStockStockinGet extends AbstractAPI {

    public YouzanRetailStockStockinGet() {
    }

    public YouzanRetailStockStockinGet(YouzanRetailStockStockinGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockin.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockinGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockinGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
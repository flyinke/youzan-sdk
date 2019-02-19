package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnGetParams;

public class YouzanRetailStockStockreturnGet extends AbstractAPI {

    public YouzanRetailStockStockreturnGet() {
    }

    public YouzanRetailStockStockreturnGet(YouzanRetailStockStockreturnGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockreturn.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockreturnGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockreturnGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
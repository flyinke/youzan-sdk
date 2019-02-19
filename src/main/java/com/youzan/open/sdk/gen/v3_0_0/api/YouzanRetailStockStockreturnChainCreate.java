package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnChainCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnChainCreateParams;

public class YouzanRetailStockStockreturnChainCreate extends AbstractAPI {

    public YouzanRetailStockStockreturnChainCreate() {
    }

    public YouzanRetailStockStockreturnChainCreate(YouzanRetailStockStockreturnChainCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockreturn.chain.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockreturnChainCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockreturnChainCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
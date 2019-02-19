package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotGetParams;

public class YouzanRetailStockStockallotGet extends AbstractAPI {

    public YouzanRetailStockStockallotGet() {
    }

    public YouzanRetailStockStockallotGet(YouzanRetailStockStockallotGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
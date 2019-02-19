package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotInResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotInParams;

public class YouzanRetailStockStockallotIn extends AbstractAPI {

    public YouzanRetailStockStockallotIn() {
    }

    public YouzanRetailStockStockallotIn(YouzanRetailStockStockallotInParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.in";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotInResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotInParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
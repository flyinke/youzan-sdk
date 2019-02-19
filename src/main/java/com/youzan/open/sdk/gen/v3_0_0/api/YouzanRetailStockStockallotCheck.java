package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCheckResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCheckParams;

public class YouzanRetailStockStockallotCheck extends AbstractAPI {

    public YouzanRetailStockStockallotCheck() {
    }

    public YouzanRetailStockStockallotCheck(YouzanRetailStockStockallotCheckParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.check";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotCheckResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotCheckParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
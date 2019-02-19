package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotUpdateParams;

public class YouzanRetailStockStockallotUpdate extends AbstractAPI {

    public YouzanRetailStockStockallotUpdate() {
    }

    public YouzanRetailStockStockallotUpdate(YouzanRetailStockStockallotUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
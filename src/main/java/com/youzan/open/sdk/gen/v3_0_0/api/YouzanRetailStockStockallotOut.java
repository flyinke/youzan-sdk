package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotOutResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotOutParams;

public class YouzanRetailStockStockallotOut extends AbstractAPI {

    public YouzanRetailStockStockallotOut() {
    }

    public YouzanRetailStockStockallotOut(YouzanRetailStockStockallotOutParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.out";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotOutResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotOutParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
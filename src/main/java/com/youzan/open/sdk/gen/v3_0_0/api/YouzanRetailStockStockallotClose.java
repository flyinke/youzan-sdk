package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCloseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCloseParams;

public class YouzanRetailStockStockallotClose extends AbstractAPI {

    public YouzanRetailStockStockallotClose() {
    }

    public YouzanRetailStockStockallotClose(YouzanRetailStockStockallotCloseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.close";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotCloseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotCloseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
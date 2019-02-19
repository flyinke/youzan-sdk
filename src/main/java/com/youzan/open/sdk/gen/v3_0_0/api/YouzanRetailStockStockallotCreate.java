package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotCreateParams;

public class YouzanRetailStockStockallotCreate extends AbstractAPI {

    public YouzanRetailStockStockallotCreate() {
    }

    public YouzanRetailStockStockallotCreate(YouzanRetailStockStockallotCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
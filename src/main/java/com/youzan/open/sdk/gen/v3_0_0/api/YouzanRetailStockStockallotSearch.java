package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockallotSearchParams;

public class YouzanRetailStockStockallotSearch extends AbstractAPI {

    public YouzanRetailStockStockallotSearch() {
    }

    public YouzanRetailStockStockallotSearch(YouzanRetailStockStockallotSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockallot.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockallotSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockallotSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
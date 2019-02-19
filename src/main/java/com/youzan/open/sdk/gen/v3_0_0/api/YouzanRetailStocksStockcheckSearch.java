package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockcheckSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockcheckSearchParams;

public class YouzanRetailStocksStockcheckSearch extends AbstractAPI {

    public YouzanRetailStocksStockcheckSearch() {
    }

    public YouzanRetailStocksStockcheckSearch(YouzanRetailStocksStockcheckSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stocks.stockcheck.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStocksStockcheckSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStocksStockcheckSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockoutSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockoutSearchParams;

public class YouzanRetailStocksStockoutSearch extends AbstractAPI {

    public YouzanRetailStocksStockoutSearch() {
    }

    public YouzanRetailStocksStockoutSearch(YouzanRetailStocksStockoutSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stocks.stockout.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStocksStockoutSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStocksStockoutSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
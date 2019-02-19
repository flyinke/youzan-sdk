package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockinSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStocksStockinSearchParams;

public class YouzanRetailStocksStockinSearch extends AbstractAPI {

    public YouzanRetailStocksStockinSearch() {
    }

    public YouzanRetailStocksStockinSearch(YouzanRetailStocksStockinSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stocks.stockin.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStocksStockinSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStocksStockinSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
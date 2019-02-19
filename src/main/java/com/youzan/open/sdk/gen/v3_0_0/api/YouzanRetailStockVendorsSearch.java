package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorsSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockVendorsSearchParams;

public class YouzanRetailStockVendorsSearch extends AbstractAPI {

    public YouzanRetailStockVendorsSearch() {
    }

    public YouzanRetailStockVendorsSearch(YouzanRetailStockVendorsSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.vendors.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockVendorsSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockVendorsSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
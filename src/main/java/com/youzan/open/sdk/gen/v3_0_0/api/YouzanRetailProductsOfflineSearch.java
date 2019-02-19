package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineSearchParams;

public class YouzanRetailProductsOfflineSearch extends AbstractAPI {

    public YouzanRetailProductsOfflineSearch() {
    }

    public YouzanRetailProductsOfflineSearch(YouzanRetailProductsOfflineSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.offline.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOfflineSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOfflineSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
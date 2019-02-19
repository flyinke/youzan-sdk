package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineSearchParams;

public class YouzanRetailProductsOnlineSearch extends AbstractAPI {

    public YouzanRetailProductsOnlineSearch() {
    }

    public YouzanRetailProductsOnlineSearch(YouzanRetailProductsOnlineSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.online.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOnlineSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOnlineSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoriesSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoriesSearchParams;

public class YouzanRetailProductCategoriesSearch extends AbstractAPI {

    public YouzanRetailProductCategoriesSearch() {
    }

    public YouzanRetailProductCategoriesSearch(YouzanRetailProductCategoriesSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.categories.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductCategoriesSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductCategoriesSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
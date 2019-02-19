package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategorySearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategorySearchParams;

public class YouzanRetailProductCategorySearch extends AbstractAPI {

    public YouzanRetailProductCategorySearch() {
    }

    public YouzanRetailProductCategorySearch(YouzanRetailProductCategorySearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.category.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductCategorySearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductCategorySearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
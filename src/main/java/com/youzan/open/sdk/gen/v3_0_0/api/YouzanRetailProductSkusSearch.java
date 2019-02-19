package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusSearchParams;

public class YouzanRetailProductSkusSearch extends AbstractAPI {

    public YouzanRetailProductSkusSearch() {
    }

    public YouzanRetailProductSkusSearch(YouzanRetailProductSkusSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.skus.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkusSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkusSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusSearchParams;

public class YouzanRetailProductSpusSearch extends AbstractAPI {

    public YouzanRetailProductSpusSearch() {
    }

    public YouzanRetailProductSpusSearch(YouzanRetailProductSpusSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spus.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpusSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpusSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
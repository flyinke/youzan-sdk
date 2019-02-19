package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountSearchResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountSearchParams;

public class YouzanUmpLimitdiscountSearch extends AbstractAPI {

    public YouzanUmpLimitdiscountSearch() {
    }

    public YouzanUmpLimitdiscountSearch(YouzanUmpLimitdiscountSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.limitdiscount.search";
    }

    public Class getResultModelClass() {
        return YouzanUmpLimitdiscountSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpLimitdiscountSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
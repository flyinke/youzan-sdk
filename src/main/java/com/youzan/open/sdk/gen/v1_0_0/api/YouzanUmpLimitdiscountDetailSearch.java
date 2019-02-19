package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountDetailSearchResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountDetailSearchParams;

public class YouzanUmpLimitdiscountDetailSearch extends AbstractAPI {

    public YouzanUmpLimitdiscountDetailSearch() {
    }

    public YouzanUmpLimitdiscountDetailSearch(YouzanUmpLimitdiscountDetailSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.limitdiscount.detail.search";
    }

    public Class getResultModelClass() {
        return YouzanUmpLimitdiscountDetailSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpLimitdiscountDetailSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
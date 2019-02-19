package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineSearchParams;

public class YouzanMultistoreOfflineSearch extends AbstractAPI {

    public YouzanMultistoreOfflineSearch() {
    }

    public YouzanMultistoreOfflineSearch(YouzanMultistoreOfflineSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.offline.search";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreOfflineSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreOfflineSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
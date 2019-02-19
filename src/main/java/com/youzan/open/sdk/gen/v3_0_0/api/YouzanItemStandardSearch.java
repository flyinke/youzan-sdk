package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemStandardSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemStandardSearchParams;

public class YouzanItemStandardSearch extends AbstractAPI {

    public YouzanItemStandardSearch() {
    }

    public YouzanItemStandardSearch(YouzanItemStandardSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.standard.search";
    }

    public Class getResultModelClass() {
        return YouzanItemStandardSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemStandardSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
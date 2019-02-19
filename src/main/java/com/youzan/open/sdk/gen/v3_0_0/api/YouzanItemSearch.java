package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSearchParams;

public class YouzanItemSearch extends AbstractAPI {

    public YouzanItemSearch() {
    }

    public YouzanItemSearch(YouzanItemSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.search";
    }

    public Class getResultModelClass() {
        return YouzanItemSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemTemplateListSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemTemplateListSearchParams;

public class YouzanItemTemplateListSearch extends AbstractAPI {

    public YouzanItemTemplateListSearch() {
    }

    public YouzanItemTemplateListSearch(YouzanItemTemplateListSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.template.list.search";
    }

    public Class getResultModelClass() {
        return YouzanItemTemplateListSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemTemplateListSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
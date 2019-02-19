package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTaglistSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTaglistSearchParams;

public class YouzanItemcategoriesTaglistSearch extends AbstractAPI {

    public YouzanItemcategoriesTaglistSearch() {
    }

    public YouzanItemcategoriesTaglistSearch(YouzanItemcategoriesTaglistSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.itemcategories.taglist.search";
    }

    public Class getResultModelClass() {
        return YouzanItemcategoriesTaglistSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemcategoriesTaglistSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
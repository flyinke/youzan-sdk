package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagsGetParams;

public class YouzanItemcategoriesTagsGet extends AbstractAPI {

    public YouzanItemcategoriesTagsGet() {
    }

    public YouzanItemcategoriesTagsGet(YouzanItemcategoriesTagsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.itemcategories.tags.get";
    }

    public Class getResultModelClass() {
        return YouzanItemcategoriesTagsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemcategoriesTagsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
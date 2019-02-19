package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagAddParams;

public class YouzanItemcategoriesTagAdd extends AbstractAPI {

    public YouzanItemcategoriesTagAdd() {
    }

    public YouzanItemcategoriesTagAdd(YouzanItemcategoriesTagAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.itemcategories.tag.add";
    }

    public Class getResultModelClass() {
        return YouzanItemcategoriesTagAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemcategoriesTagAddParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
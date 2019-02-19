package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagUpdateParams;

public class YouzanItemcategoriesTagUpdate extends AbstractAPI {

    public YouzanItemcategoriesTagUpdate() {
    }

    public YouzanItemcategoriesTagUpdate(YouzanItemcategoriesTagUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.itemcategories.tag.update";
    }

    public Class getResultModelClass() {
        return YouzanItemcategoriesTagUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemcategoriesTagUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
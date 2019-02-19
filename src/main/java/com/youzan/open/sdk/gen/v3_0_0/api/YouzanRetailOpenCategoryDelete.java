package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryDeleteParams;

public class YouzanRetailOpenCategoryDelete extends AbstractAPI {

    public YouzanRetailOpenCategoryDelete() {
    }

    public YouzanRetailOpenCategoryDelete(YouzanRetailOpenCategoryDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.category.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenCategoryDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenCategoryDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
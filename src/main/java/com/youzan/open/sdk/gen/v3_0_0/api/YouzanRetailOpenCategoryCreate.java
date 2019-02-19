package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryCreateParams;

public class YouzanRetailOpenCategoryCreate extends AbstractAPI {

    public YouzanRetailOpenCategoryCreate() {
    }

    public YouzanRetailOpenCategoryCreate(YouzanRetailOpenCategoryCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.category.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenCategoryCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenCategoryCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryQueryParams;

public class YouzanRetailOpenCategoryQuery extends AbstractAPI {

    public YouzanRetailOpenCategoryQuery() {
    }

    public YouzanRetailOpenCategoryQuery(YouzanRetailOpenCategoryQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.category.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenCategoryQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenCategoryQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
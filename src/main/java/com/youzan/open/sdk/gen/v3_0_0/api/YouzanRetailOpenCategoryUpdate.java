package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenCategoryUpdateParams;

public class YouzanRetailOpenCategoryUpdate extends AbstractAPI {

    public YouzanRetailOpenCategoryUpdate() {
    }

    public YouzanRetailOpenCategoryUpdate(YouzanRetailOpenCategoryUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.category.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenCategoryUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenCategoryUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
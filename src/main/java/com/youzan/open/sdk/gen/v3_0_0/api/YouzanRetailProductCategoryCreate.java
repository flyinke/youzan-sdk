package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryCreateParams;

public class YouzanRetailProductCategoryCreate extends AbstractAPI {

    public YouzanRetailProductCategoryCreate() {
    }

    public YouzanRetailProductCategoryCreate(YouzanRetailProductCategoryCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.category.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductCategoryCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductCategoryCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
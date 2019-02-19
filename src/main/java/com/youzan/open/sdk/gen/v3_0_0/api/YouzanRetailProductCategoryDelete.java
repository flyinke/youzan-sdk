package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryDeleteParams;

public class YouzanRetailProductCategoryDelete extends AbstractAPI {

    public YouzanRetailProductCategoryDelete() {
    }

    public YouzanRetailProductCategoryDelete(YouzanRetailProductCategoryDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.category.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductCategoryDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductCategoryDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
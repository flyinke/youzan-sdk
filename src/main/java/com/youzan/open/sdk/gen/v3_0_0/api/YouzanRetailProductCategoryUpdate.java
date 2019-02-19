package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductCategoryUpdateParams;

public class YouzanRetailProductCategoryUpdate extends AbstractAPI {

    public YouzanRetailProductCategoryUpdate() {
    }

    public YouzanRetailProductCategoryUpdate(YouzanRetailProductCategoryUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.category.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductCategoryUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductCategoryUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
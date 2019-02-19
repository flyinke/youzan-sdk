package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkucategoriesUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkucategoriesUpdateParams;

public class YouzanRetailProductSkucategoriesUpdate extends AbstractAPI {

    public YouzanRetailProductSkucategoriesUpdate() {
    }

    public YouzanRetailProductSkucategoriesUpdate(YouzanRetailProductSkucategoriesUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.skucategories.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkucategoriesUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkucategoriesUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
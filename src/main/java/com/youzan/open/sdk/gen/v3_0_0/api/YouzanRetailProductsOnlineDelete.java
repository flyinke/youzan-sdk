package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineDeleteParams;

public class YouzanRetailProductsOnlineDelete extends AbstractAPI {

    public YouzanRetailProductsOnlineDelete() {
    }

    public YouzanRetailProductsOnlineDelete(YouzanRetailProductsOnlineDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.online.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOnlineDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOnlineDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
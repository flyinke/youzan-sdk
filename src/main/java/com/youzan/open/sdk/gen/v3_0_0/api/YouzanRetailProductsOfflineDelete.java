package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineDeleteParams;

public class YouzanRetailProductsOfflineDelete extends AbstractAPI {

    public YouzanRetailProductsOfflineDelete() {
    }

    public YouzanRetailProductsOfflineDelete(YouzanRetailProductsOfflineDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.offline.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOfflineDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOfflineDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
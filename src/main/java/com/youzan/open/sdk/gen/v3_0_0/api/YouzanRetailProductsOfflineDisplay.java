package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineDisplayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOfflineDisplayParams;

public class YouzanRetailProductsOfflineDisplay extends AbstractAPI {

    public YouzanRetailProductsOfflineDisplay() {
    }

    public YouzanRetailProductsOfflineDisplay(YouzanRetailProductsOfflineDisplayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.offline.display";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOfflineDisplayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOfflineDisplayParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineDisplayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductsOnlineDisplayParams;

public class YouzanRetailProductsOnlineDisplay extends AbstractAPI {

    public YouzanRetailProductsOnlineDisplay() {
    }

    public YouzanRetailProductsOnlineDisplay(YouzanRetailProductsOnlineDisplayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.products.online.display";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductsOnlineDisplayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductsOnlineDisplayParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuGetParams;

public class YouzanRetailProductSkuGet extends AbstractAPI {

    public YouzanRetailProductSkuGet() {
    }

    public YouzanRetailProductSkuGet(YouzanRetailProductSkuGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.sku.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkuGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkuGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
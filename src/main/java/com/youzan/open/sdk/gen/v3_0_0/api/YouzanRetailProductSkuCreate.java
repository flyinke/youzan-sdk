package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuCreateParams;

public class YouzanRetailProductSkuCreate extends AbstractAPI {

    public YouzanRetailProductSkuCreate() {
    }

    public YouzanRetailProductSkuCreate(YouzanRetailProductSkuCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.sku.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkuCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkuCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
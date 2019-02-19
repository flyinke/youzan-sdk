package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkuUpdateParams;

public class YouzanRetailProductSkuUpdate extends AbstractAPI {

    public YouzanRetailProductSkuUpdate() {
    }

    public YouzanRetailProductSkuUpdate(YouzanRetailProductSkuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.sku.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
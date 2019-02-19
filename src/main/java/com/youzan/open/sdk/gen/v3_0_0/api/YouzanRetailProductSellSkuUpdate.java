package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSellSkuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSellSkuUpdateParams;

public class YouzanRetailProductSellSkuUpdate extends AbstractAPI {

    public YouzanRetailProductSellSkuUpdate() {
    }

    public YouzanRetailProductSellSkuUpdate(YouzanRetailProductSellSkuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.sell.sku.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSellSkuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSellSkuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
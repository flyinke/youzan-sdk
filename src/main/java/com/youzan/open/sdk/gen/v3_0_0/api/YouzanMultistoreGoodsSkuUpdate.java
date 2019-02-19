package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSkuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSkuUpdateParams;

public class YouzanMultistoreGoodsSkuUpdate extends AbstractAPI {

    public YouzanMultistoreGoodsSkuUpdate() {
    }

    public YouzanMultistoreGoodsSkuUpdate(YouzanMultistoreGoodsSkuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.sku.update";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsSkuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsSkuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
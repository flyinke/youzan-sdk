package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSkuGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSkuGetParams;

public class YouzanMultistoreGoodsSkuGet extends AbstractAPI {

    public YouzanMultistoreGoodsSkuGet() {
    }

    public YouzanMultistoreGoodsSkuGet(YouzanMultistoreGoodsSkuGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.sku.get";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsSkuGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsSkuGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
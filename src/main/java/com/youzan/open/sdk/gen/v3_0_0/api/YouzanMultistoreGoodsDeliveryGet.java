package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryGetParams;

public class YouzanMultistoreGoodsDeliveryGet extends AbstractAPI {

    public YouzanMultistoreGoodsDeliveryGet() {
    }

    public YouzanMultistoreGoodsDeliveryGet(YouzanMultistoreGoodsDeliveryGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.delivery.get";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsDeliveryGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsDeliveryGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
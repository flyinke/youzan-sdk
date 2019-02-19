package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryUpdateParams;

public class YouzanMultistoreGoodsDeliveryUpdate extends AbstractAPI {

    public YouzanMultistoreGoodsDeliveryUpdate() {
    }

    public YouzanMultistoreGoodsDeliveryUpdate(YouzanMultistoreGoodsDeliveryUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.delivery.update";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsDeliveryUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsDeliveryUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
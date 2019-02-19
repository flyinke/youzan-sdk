package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsDeliveryListParams;

public class YouzanMultistoreGoodsDeliveryList extends AbstractAPI {

    public YouzanMultistoreGoodsDeliveryList() {
    }

    public YouzanMultistoreGoodsDeliveryList(YouzanMultistoreGoodsDeliveryListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.delivery.list";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsDeliveryListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsDeliveryListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
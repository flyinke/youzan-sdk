package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuItemCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuItemCreateParams;

public class YouzanMeiGoodsServingSkuItemCreate extends AbstractAPI {

    public YouzanMeiGoodsServingSkuItemCreate() {
    }

    public YouzanMeiGoodsServingSkuItemCreate(YouzanMeiGoodsServingSkuItemCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.sku.item.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingSkuItemCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingSkuItemCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuItemCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuItemCreateParams;

public class YouzanMeiGoodsProductSkuItemCreate extends AbstractAPI {

    public YouzanMeiGoodsProductSkuItemCreate() {
    }

    public YouzanMeiGoodsProductSkuItemCreate(YouzanMeiGoodsProductSkuItemCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.sku.item.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductSkuItemCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductSkuItemCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
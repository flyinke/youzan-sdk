package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuCreateParams;

public class YouzanMeiGoodsProductSkuCreate extends AbstractAPI {

    public YouzanMeiGoodsProductSkuCreate() {
    }

    public YouzanMeiGoodsProductSkuCreate(YouzanMeiGoodsProductSkuCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.sku.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductSkuCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductSkuCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
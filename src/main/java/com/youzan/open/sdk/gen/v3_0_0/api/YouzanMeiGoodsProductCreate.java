package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCreateParams;

public class YouzanMeiGoodsProductCreate extends AbstractAPI {

    public YouzanMeiGoodsProductCreate() {
    }

    public YouzanMeiGoodsProductCreate(YouzanMeiGoodsProductCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
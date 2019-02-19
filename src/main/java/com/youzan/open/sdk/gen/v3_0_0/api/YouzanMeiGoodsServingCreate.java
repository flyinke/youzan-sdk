package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCreateParams;

public class YouzanMeiGoodsServingCreate extends AbstractAPI {

    public YouzanMeiGoodsServingCreate() {
    }

    public YouzanMeiGoodsServingCreate(YouzanMeiGoodsServingCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
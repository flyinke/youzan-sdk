package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagCreateParams;

public class YouzanMeiGoodsServingTagCreate extends AbstractAPI {

    public YouzanMeiGoodsServingTagCreate() {
    }

    public YouzanMeiGoodsServingTagCreate(YouzanMeiGoodsServingTagCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.tag.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingTagCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingTagCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
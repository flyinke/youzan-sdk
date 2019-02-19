package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryCreateParams;

public class YouzanMeiGoodsServingCategoryCreate extends AbstractAPI {

    public YouzanMeiGoodsServingCategoryCreate() {
    }

    public YouzanMeiGoodsServingCategoryCreate(YouzanMeiGoodsServingCategoryCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.category.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingCategoryCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingCategoryCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryUpdateParams;

public class YouzanMeiGoodsServingCategoryUpdate extends AbstractAPI {

    public YouzanMeiGoodsServingCategoryUpdate() {
    }

    public YouzanMeiGoodsServingCategoryUpdate(YouzanMeiGoodsServingCategoryUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.category.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingCategoryUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingCategoryUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
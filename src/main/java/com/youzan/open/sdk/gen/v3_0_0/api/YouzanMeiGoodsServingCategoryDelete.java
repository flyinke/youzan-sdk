package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryDeleteParams;

public class YouzanMeiGoodsServingCategoryDelete extends AbstractAPI {

    public YouzanMeiGoodsServingCategoryDelete() {
    }

    public YouzanMeiGoodsServingCategoryDelete(YouzanMeiGoodsServingCategoryDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.category.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingCategoryDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingCategoryDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
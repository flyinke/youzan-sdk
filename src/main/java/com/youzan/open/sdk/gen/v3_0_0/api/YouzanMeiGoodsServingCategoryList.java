package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingCategoryListParams;

public class YouzanMeiGoodsServingCategoryList extends AbstractAPI {

    public YouzanMeiGoodsServingCategoryList() {
    }

    public YouzanMeiGoodsServingCategoryList(YouzanMeiGoodsServingCategoryListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.category.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingCategoryListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingCategoryListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
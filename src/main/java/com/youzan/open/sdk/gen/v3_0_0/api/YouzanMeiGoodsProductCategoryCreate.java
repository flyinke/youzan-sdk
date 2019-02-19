package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryCreateParams;

public class YouzanMeiGoodsProductCategoryCreate extends AbstractAPI {

    public YouzanMeiGoodsProductCategoryCreate() {
    }

    public YouzanMeiGoodsProductCategoryCreate(YouzanMeiGoodsProductCategoryCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.category.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductCategoryCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductCategoryCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
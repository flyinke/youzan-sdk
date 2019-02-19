package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryDeleteParams;

public class YouzanMeiGoodsProductCategoryDelete extends AbstractAPI {

    public YouzanMeiGoodsProductCategoryDelete() {
    }

    public YouzanMeiGoodsProductCategoryDelete(YouzanMeiGoodsProductCategoryDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.category.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductCategoryDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductCategoryDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
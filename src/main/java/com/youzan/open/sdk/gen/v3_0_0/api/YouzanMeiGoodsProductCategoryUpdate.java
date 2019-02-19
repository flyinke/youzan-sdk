package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryUpdateParams;

public class YouzanMeiGoodsProductCategoryUpdate extends AbstractAPI {

    public YouzanMeiGoodsProductCategoryUpdate() {
    }

    public YouzanMeiGoodsProductCategoryUpdate(YouzanMeiGoodsProductCategoryUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.category.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductCategoryUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductCategoryUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
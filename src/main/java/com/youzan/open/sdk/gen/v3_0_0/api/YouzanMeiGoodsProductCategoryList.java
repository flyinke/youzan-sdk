package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductCategoryListParams;

public class YouzanMeiGoodsProductCategoryList extends AbstractAPI {

    public YouzanMeiGoodsProductCategoryList() {
    }

    public YouzanMeiGoodsProductCategoryList(YouzanMeiGoodsProductCategoryListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.category.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductCategoryListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductCategoryListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
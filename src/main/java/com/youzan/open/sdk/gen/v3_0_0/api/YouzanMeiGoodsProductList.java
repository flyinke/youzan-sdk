package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductListParams;

public class YouzanMeiGoodsProductList extends AbstractAPI {

    public YouzanMeiGoodsProductList() {
    }

    public YouzanMeiGoodsProductList(YouzanMeiGoodsProductListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
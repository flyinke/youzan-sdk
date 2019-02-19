package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuListParams;

public class YouzanMeiGoodsServingSkuList extends AbstractAPI {

    public YouzanMeiGoodsServingSkuList() {
    }

    public YouzanMeiGoodsServingSkuList(YouzanMeiGoodsServingSkuListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.sku.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingSkuListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingSkuListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
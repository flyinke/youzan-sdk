package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuItemListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingSkuItemListParams;

public class YouzanMeiGoodsServingSkuItemList extends AbstractAPI {

    public YouzanMeiGoodsServingSkuItemList() {
    }

    public YouzanMeiGoodsServingSkuItemList(YouzanMeiGoodsServingSkuItemListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.sku.item.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingSkuItemListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingSkuItemListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
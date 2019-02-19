package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuItemListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuItemListParams;

public class YouzanMeiGoodsProductSkuItemList extends AbstractAPI {

    public YouzanMeiGoodsProductSkuItemList() {
    }

    public YouzanMeiGoodsProductSkuItemList(YouzanMeiGoodsProductSkuItemListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.sku.item.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductSkuItemListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductSkuItemListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
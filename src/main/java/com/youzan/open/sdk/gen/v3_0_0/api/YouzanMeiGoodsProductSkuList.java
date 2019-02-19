package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductSkuListParams;

public class YouzanMeiGoodsProductSkuList extends AbstractAPI {

    public YouzanMeiGoodsProductSkuList() {
    }

    public YouzanMeiGoodsProductSkuList(YouzanMeiGoodsProductSkuListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.sku.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductSkuListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductSkuListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductGetParams;

public class YouzanMeiGoodsProductGet extends AbstractAPI {

    public YouzanMeiGoodsProductGet() {
    }

    public YouzanMeiGoodsProductGet(YouzanMeiGoodsProductGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
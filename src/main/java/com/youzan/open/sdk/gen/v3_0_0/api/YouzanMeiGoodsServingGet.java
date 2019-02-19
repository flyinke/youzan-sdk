package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingGetParams;

public class YouzanMeiGoodsServingGet extends AbstractAPI {

    public YouzanMeiGoodsServingGet() {
    }

    public YouzanMeiGoodsServingGet(YouzanMeiGoodsServingGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
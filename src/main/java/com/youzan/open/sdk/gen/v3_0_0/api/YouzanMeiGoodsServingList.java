package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingListParams;

public class YouzanMeiGoodsServingList extends AbstractAPI {

    public YouzanMeiGoodsServingList() {
    }

    public YouzanMeiGoodsServingList(YouzanMeiGoodsServingListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
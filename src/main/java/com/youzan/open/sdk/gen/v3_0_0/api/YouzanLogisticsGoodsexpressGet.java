package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsGoodsexpressGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsGoodsexpressGetParams;

public class YouzanLogisticsGoodsexpressGet extends AbstractAPI {

    public YouzanLogisticsGoodsexpressGet() {
    }

    public YouzanLogisticsGoodsexpressGet(YouzanLogisticsGoodsexpressGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.goodsexpress.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsGoodsexpressGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsGoodsexpressGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
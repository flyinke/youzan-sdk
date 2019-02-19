package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillGoodsUrlGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillGoodsUrlGetParams;

public class YouzanTradeBillGoodsUrlGet extends AbstractAPI {

    public YouzanTradeBillGoodsUrlGet() {
    }

    public YouzanTradeBillGoodsUrlGet(YouzanTradeBillGoodsUrlGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.bill.goods.url.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeBillGoodsUrlGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeBillGoodsUrlGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
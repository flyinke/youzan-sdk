package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillGoodUrlGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeBillGoodUrlGetParams;

public class YouzanTradeBillGoodUrlGet extends AbstractAPI {

    public YouzanTradeBillGoodUrlGet() {
    }

    public YouzanTradeBillGoodUrlGet(YouzanTradeBillGoodUrlGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.bill.good.url.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeBillGoodUrlGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeBillGoodUrlGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
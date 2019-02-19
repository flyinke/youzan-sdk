package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderDetailGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderDetailGetParams;

public class YouzanFenxiaoSupportOrderDetailGet extends AbstractAPI {

    public YouzanFenxiaoSupportOrderDetailGet() {
    }

    public YouzanFenxiaoSupportOrderDetailGet(YouzanFenxiaoSupportOrderDetailGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.fenxiao.support.order.detail.get";
    }

    public Class getResultModelClass() {
        return YouzanFenxiaoSupportOrderDetailGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanFenxiaoSupportOrderDetailGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
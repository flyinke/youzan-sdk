package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderDeliverResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanFenxiaoSupportOrderDeliverParams;

public class YouzanFenxiaoSupportOrderDeliver extends AbstractAPI {

    public YouzanFenxiaoSupportOrderDeliver() {
    }

    public YouzanFenxiaoSupportOrderDeliver(YouzanFenxiaoSupportOrderDeliverParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.fenxiao.support.order.deliver";
    }

    public Class getResultModelClass() {
        return YouzanFenxiaoSupportOrderDeliverResult.class;
    }

    public Class getParamModelClass() {
        return YouzanFenxiaoSupportOrderDeliverParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
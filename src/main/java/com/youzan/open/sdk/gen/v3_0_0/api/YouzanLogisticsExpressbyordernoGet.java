package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressbyordernoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressbyordernoGetParams;

public class YouzanLogisticsExpressbyordernoGet extends AbstractAPI {

    public YouzanLogisticsExpressbyordernoGet() {
    }

    public YouzanLogisticsExpressbyordernoGet(YouzanLogisticsExpressbyordernoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.expressbyorderno.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsExpressbyordernoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsExpressbyordernoGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
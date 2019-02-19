package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodesGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodesGetParams;

public class YouzanPayQrcodesGet extends AbstractAPI {

    public YouzanPayQrcodesGet() {
    }

    public YouzanPayQrcodesGet(YouzanPayQrcodesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.pay.qrcodes.get";
    }

    public Class getResultModelClass() {
        return YouzanPayQrcodesGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanPayQrcodesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
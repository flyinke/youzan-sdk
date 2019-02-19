package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodeGetParams;

public class YouzanPayQrcodeGet extends AbstractAPI {

    public YouzanPayQrcodeGet() {
    }

    public YouzanPayQrcodeGet(YouzanPayQrcodeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.pay.qrcode.get";
    }

    public Class getResultModelClass() {
        return YouzanPayQrcodeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanPayQrcodeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
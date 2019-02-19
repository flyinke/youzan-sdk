package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodeCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanPayQrcodeCreateParams;

public class YouzanPayQrcodeCreate extends AbstractAPI {

    public YouzanPayQrcodeCreate() {
    }

    public YouzanPayQrcodeCreate(YouzanPayQrcodeCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.pay.qrcode.create";
    }

    public Class getResultModelClass() {
        return YouzanPayQrcodeCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanPayQrcodeCreateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
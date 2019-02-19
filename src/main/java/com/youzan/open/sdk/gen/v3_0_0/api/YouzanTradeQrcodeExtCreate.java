package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeQrcodeExtCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeQrcodeExtCreateParams;

public class YouzanTradeQrcodeExtCreate extends AbstractAPI {

    public YouzanTradeQrcodeExtCreate() {
    }

    public YouzanTradeQrcodeExtCreate(YouzanTradeQrcodeExtCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.qrcode.ext.create";
    }

    public Class getResultModelClass() {
        return YouzanTradeQrcodeExtCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeQrcodeExtCreateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
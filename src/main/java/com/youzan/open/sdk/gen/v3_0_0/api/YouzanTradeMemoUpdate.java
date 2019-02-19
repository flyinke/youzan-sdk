package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeMemoUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeMemoUpdateParams;

public class YouzanTradeMemoUpdate extends AbstractAPI {

    public YouzanTradeMemoUpdate() {
    }

    public YouzanTradeMemoUpdate(YouzanTradeMemoUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.memo.update";
    }

    public Class getResultModelClass() {
        return YouzanTradeMemoUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeMemoUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
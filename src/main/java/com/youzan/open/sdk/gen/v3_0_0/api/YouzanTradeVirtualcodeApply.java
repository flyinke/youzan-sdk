package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualcodeApplyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeVirtualcodeApplyParams;

public class YouzanTradeVirtualcodeApply extends AbstractAPI {

    public YouzanTradeVirtualcodeApply() {
    }

    public YouzanTradeVirtualcodeApply(YouzanTradeVirtualcodeApplyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.virtualcode.apply";
    }

    public Class getResultModelClass() {
        return YouzanTradeVirtualcodeApplyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeVirtualcodeApplyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeSelffetchcodeApplyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeSelffetchcodeApplyParams;

public class YouzanTradeSelffetchcodeApply extends AbstractAPI {

    public YouzanTradeSelffetchcodeApply() {
    }

    public YouzanTradeSelffetchcodeApply(YouzanTradeSelffetchcodeApplyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.selffetchcode.apply";
    }

    public Class getResultModelClass() {
        return YouzanTradeSelffetchcodeApplyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeSelffetchcodeApplyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
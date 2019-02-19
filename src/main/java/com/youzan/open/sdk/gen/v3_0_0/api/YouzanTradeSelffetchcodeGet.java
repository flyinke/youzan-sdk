package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeSelffetchcodeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeSelffetchcodeGetParams;

public class YouzanTradeSelffetchcodeGet extends AbstractAPI {

    public YouzanTradeSelffetchcodeGet() {
    }

    public YouzanTradeSelffetchcodeGet(YouzanTradeSelffetchcodeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.selffetchcode.get";
    }

    public Class getResultModelClass() {
        return YouzanTradeSelffetchcodeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeSelffetchcodeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
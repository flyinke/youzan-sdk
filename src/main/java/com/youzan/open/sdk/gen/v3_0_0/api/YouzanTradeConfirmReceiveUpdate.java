package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeConfirmReceiveUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeConfirmReceiveUpdateParams;

public class YouzanTradeConfirmReceiveUpdate extends AbstractAPI {

    public YouzanTradeConfirmReceiveUpdate() {
    }

    public YouzanTradeConfirmReceiveUpdate(YouzanTradeConfirmReceiveUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.confirm.receive.update";
    }

    public Class getResultModelClass() {
        return YouzanTradeConfirmReceiveUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeConfirmReceiveUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
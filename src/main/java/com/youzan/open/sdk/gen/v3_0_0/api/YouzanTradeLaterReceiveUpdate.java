package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeLaterReceiveUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeLaterReceiveUpdateParams;

public class YouzanTradeLaterReceiveUpdate extends AbstractAPI {

    public YouzanTradeLaterReceiveUpdate() {
    }

    public YouzanTradeLaterReceiveUpdate(YouzanTradeLaterReceiveUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.trade.later.receive.update";
    }

    public Class getResultModelClass() {
        return YouzanTradeLaterReceiveUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeLaterReceiveUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineDelayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineDelayParams;

public class YouzanLogisticsOnlineDelay extends AbstractAPI {

    public YouzanLogisticsOnlineDelay() {
    }

    public YouzanLogisticsOnlineDelay(YouzanLogisticsOnlineDelayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.online.delay";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOnlineDelayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOnlineDelayParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
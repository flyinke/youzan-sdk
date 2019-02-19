package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineCanceldelayResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineCanceldelayParams;

public class YouzanLogisticsOnlineCanceldelay extends AbstractAPI {

    public YouzanLogisticsOnlineCanceldelay() {
    }

    public YouzanLogisticsOnlineCanceldelay(YouzanLogisticsOnlineCanceldelayParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.online.canceldelay";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOnlineCanceldelayResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOnlineCanceldelayParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
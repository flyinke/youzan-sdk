package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineUpdateParams;

public class YouzanLogisticsOnlineUpdate extends AbstractAPI {

    public YouzanLogisticsOnlineUpdate() {
    }

    public YouzanLogisticsOnlineUpdate(YouzanLogisticsOnlineUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.online.update";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOnlineUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOnlineUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
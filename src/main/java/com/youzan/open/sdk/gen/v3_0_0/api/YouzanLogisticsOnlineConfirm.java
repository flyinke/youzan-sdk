package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineConfirmResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsOnlineConfirmParams;

public class YouzanLogisticsOnlineConfirm extends AbstractAPI {

    public YouzanLogisticsOnlineConfirm() {
    }

    public YouzanLogisticsOnlineConfirm(YouzanLogisticsOnlineConfirmParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.online.confirm";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOnlineConfirmResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOnlineConfirmParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
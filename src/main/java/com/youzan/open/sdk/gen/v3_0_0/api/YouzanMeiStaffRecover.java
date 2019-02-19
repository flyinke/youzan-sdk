package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffRecoverResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffRecoverParams;

public class YouzanMeiStaffRecover extends AbstractAPI {

    public YouzanMeiStaffRecover() {
    }

    public YouzanMeiStaffRecover(YouzanMeiStaffRecoverParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.recover";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffRecoverResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffRecoverParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
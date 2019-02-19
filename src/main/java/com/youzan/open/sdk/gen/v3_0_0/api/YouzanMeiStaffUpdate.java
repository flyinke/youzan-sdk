package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffUpdateParams;

public class YouzanMeiStaffUpdate extends AbstractAPI {

    public YouzanMeiStaffUpdate() {
    }

    public YouzanMeiStaffUpdate(YouzanMeiStaffUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
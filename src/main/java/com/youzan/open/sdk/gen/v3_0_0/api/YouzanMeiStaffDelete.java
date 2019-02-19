package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffDeleteParams;

public class YouzanMeiStaffDelete extends AbstractAPI {

    public YouzanMeiStaffDelete() {
    }

    public YouzanMeiStaffDelete(YouzanMeiStaffDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
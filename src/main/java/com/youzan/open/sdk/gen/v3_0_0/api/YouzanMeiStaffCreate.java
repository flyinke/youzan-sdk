package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffCreateParams;

public class YouzanMeiStaffCreate extends AbstractAPI {

    public YouzanMeiStaffCreate() {
    }

    public YouzanMeiStaffCreate(YouzanMeiStaffCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
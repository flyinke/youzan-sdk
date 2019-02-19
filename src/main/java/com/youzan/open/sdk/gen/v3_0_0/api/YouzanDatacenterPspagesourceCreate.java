package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceCreateParams;

public class YouzanDatacenterPspagesourceCreate extends AbstractAPI {

    public YouzanDatacenterPspagesourceCreate() {
    }

    public YouzanDatacenterPspagesourceCreate(YouzanDatacenterPspagesourceCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.pspagesource.create";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPspagesourceCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPspagesourceCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
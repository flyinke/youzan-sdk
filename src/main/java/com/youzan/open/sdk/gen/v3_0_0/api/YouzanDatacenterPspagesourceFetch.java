package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceFetchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceFetchParams;

public class YouzanDatacenterPspagesourceFetch extends AbstractAPI {

    public YouzanDatacenterPspagesourceFetch() {
    }

    public YouzanDatacenterPspagesourceFetch(YouzanDatacenterPspagesourceFetchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.pspagesource.fetch";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPspagesourceFetchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPspagesourceFetchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
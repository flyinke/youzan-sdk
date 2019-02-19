package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPsstockFetchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPsstockFetchParams;

public class YouzanDatacenterPsstockFetch extends AbstractAPI {

    public YouzanDatacenterPsstockFetch() {
    }

    public YouzanDatacenterPsstockFetch(YouzanDatacenterPsstockFetchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.psstock.fetch";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPsstockFetchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPsstockFetchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
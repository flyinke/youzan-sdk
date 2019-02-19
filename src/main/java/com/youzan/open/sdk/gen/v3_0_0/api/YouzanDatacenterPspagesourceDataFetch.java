package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceDataFetchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceDataFetchParams;

public class YouzanDatacenterPspagesourceDataFetch extends AbstractAPI {

    public YouzanDatacenterPspagesourceDataFetch() {
    }

    public YouzanDatacenterPspagesourceDataFetch(YouzanDatacenterPspagesourceDataFetchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.pspagesource.data.fetch";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPspagesourceDataFetchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPspagesourceDataFetchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceOrderFetchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPspagesourceOrderFetchParams;

public class YouzanDatacenterPspagesourceOrderFetch extends AbstractAPI {

    public YouzanDatacenterPspagesourceOrderFetch() {
    }

    public YouzanDatacenterPspagesourceOrderFetch(YouzanDatacenterPspagesourceOrderFetchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.pspagesource.order.fetch";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPspagesourceOrderFetchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPspagesourceOrderFetchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
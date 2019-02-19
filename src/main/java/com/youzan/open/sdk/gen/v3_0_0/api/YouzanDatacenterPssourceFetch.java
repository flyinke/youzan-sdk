package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPssourceFetchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanDatacenterPssourceFetchParams;

public class YouzanDatacenterPssourceFetch extends AbstractAPI {

    public YouzanDatacenterPssourceFetch() {
    }

    public YouzanDatacenterPssourceFetch(YouzanDatacenterPssourceFetchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.datacenter.pssource.fetch";
    }

    public Class getResultModelClass() {
        return YouzanDatacenterPssourceFetchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanDatacenterPssourceFetchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
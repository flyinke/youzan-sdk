package com.youzan.open.sdk.api;

import com.google.common.collect.Maps;

import java.util.Map;

public abstract class AbstractAPI implements API {

    protected APIParams params;

    public APIParams getAPIParams() {
        return this.params;
    }

    public void setAPIParams(APIParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpUrl() {
        return APIFactory.SERVICE_HOST + "/api";
    }

    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public Map<String, String> getHeaders() {
        return Maps.newHashMap();
    }
}

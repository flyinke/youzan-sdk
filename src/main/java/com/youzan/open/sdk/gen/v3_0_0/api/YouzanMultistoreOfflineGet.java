package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineGetParams;

public class YouzanMultistoreOfflineGet extends AbstractAPI {

    public YouzanMultistoreOfflineGet() {
    }

    public YouzanMultistoreOfflineGet(YouzanMultistoreOfflineGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.offline.get";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreOfflineGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreOfflineGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
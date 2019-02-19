package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineUpdateParams;

public class YouzanMultistoreOfflineUpdate extends AbstractAPI {

    public YouzanMultistoreOfflineUpdate() {
    }

    public YouzanMultistoreOfflineUpdate(YouzanMultistoreOfflineUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.offline.update";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreOfflineUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreOfflineUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
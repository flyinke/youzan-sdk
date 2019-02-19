package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreOfflineCreateParams;

public class YouzanMultistoreOfflineCreate extends AbstractAPI {

    public YouzanMultistoreOfflineCreate() {
    }

    public YouzanMultistoreOfflineCreate(YouzanMultistoreOfflineCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.offline.create";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreOfflineCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreOfflineCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
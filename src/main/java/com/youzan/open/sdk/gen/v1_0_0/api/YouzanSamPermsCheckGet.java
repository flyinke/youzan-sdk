package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanSamPermsCheckGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanSamPermsCheckGetParams;

public class YouzanSamPermsCheckGet extends AbstractAPI {

    public YouzanSamPermsCheckGet() {
    }

    public YouzanSamPermsCheckGet(YouzanSamPermsCheckGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.sam.perms.check.get";
    }

    public Class getResultModelClass() {
        return YouzanSamPermsCheckGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSamPermsCheckGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
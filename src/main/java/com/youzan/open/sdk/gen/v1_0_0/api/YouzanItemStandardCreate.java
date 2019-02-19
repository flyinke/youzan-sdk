package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardCreateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardCreateParams;

public class YouzanItemStandardCreate extends AbstractAPI {

    public YouzanItemStandardCreate() {
    }

    public YouzanItemStandardCreate(YouzanItemStandardCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.item.standard.create";
    }

    public Class getResultModelClass() {
        return YouzanItemStandardCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemStandardCreateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
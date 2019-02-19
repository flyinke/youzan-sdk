package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemCreateParams;

public class YouzanItemCreate extends AbstractAPI {

    public YouzanItemCreate() {
    }

    public YouzanItemCreate(YouzanItemCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.create";
    }

    public Class getResultModelClass() {
        return YouzanItemCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
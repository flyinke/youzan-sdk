package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelCreateParams;

public class YouzanMeiMemberlevelCreate extends AbstractAPI {

    public YouzanMeiMemberlevelCreate() {
    }

    public YouzanMeiMemberlevelCreate(YouzanMeiMemberlevelCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.memberlevel.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiMemberlevelCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiMemberlevelCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
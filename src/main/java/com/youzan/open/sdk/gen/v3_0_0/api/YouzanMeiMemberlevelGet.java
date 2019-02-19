package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelGetParams;

public class YouzanMeiMemberlevelGet extends AbstractAPI {

    public YouzanMeiMemberlevelGet() {
    }

    public YouzanMeiMemberlevelGet(YouzanMeiMemberlevelGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.memberlevel.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiMemberlevelGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiMemberlevelGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
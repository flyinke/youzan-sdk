package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelDeleteParams;

public class YouzanMeiMemberlevelDelete extends AbstractAPI {

    public YouzanMeiMemberlevelDelete() {
    }

    public YouzanMeiMemberlevelDelete(YouzanMeiMemberlevelDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.memberlevel.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiMemberlevelDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiMemberlevelDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
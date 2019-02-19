package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelUpdateParams;

public class YouzanMeiMemberlevelUpdate extends AbstractAPI {

    public YouzanMeiMemberlevelUpdate() {
    }

    public YouzanMeiMemberlevelUpdate(YouzanMeiMemberlevelUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.memberlevel.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiMemberlevelUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiMemberlevelUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
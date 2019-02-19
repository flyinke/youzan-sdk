package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiMemberlevelListParams;

public class YouzanMeiMemberlevelList extends AbstractAPI {

    public YouzanMeiMemberlevelList() {
    }

    public YouzanMeiMemberlevelList(YouzanMeiMemberlevelListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.memberlevel.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiMemberlevelListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiMemberlevelListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
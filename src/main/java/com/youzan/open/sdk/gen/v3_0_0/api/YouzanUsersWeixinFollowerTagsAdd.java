package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsAddParams;

public class YouzanUsersWeixinFollowerTagsAdd extends AbstractAPI {

    public YouzanUsersWeixinFollowerTagsAdd() {
    }

    public YouzanUsersWeixinFollowerTagsAdd(YouzanUsersWeixinFollowerTagsAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.follower.tags.add";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowerTagsAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowerTagsAddParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
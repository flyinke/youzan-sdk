package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersGetParams;

public class YouzanUsersWeixinFollowersGet extends AbstractAPI {

    public YouzanUsersWeixinFollowersGet() {
    }

    public YouzanUsersWeixinFollowersGet(YouzanUsersWeixinFollowersGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.followers.get";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowersGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowersGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
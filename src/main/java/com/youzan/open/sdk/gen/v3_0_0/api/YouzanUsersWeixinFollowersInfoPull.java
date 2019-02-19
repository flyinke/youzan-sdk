package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersInfoPullResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersInfoPullParams;

public class YouzanUsersWeixinFollowersInfoPull extends AbstractAPI {

    public YouzanUsersWeixinFollowersInfoPull() {
    }

    public YouzanUsersWeixinFollowersInfoPull(YouzanUsersWeixinFollowersInfoPullParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.followers.info.pull";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowersInfoPullResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowersInfoPullParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersPullResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersPullParams;

public class YouzanUsersWeixinFollowersPull extends AbstractAPI {

    public YouzanUsersWeixinFollowersPull() {
    }

    public YouzanUsersWeixinFollowersPull(YouzanUsersWeixinFollowersPullParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.followers.pull";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowersPullResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowersPullParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerGetParams;

public class YouzanUsersWeixinFollowerGet extends AbstractAPI {

    public YouzanUsersWeixinFollowerGet() {
    }

    public YouzanUsersWeixinFollowerGet(YouzanUsersWeixinFollowerGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.follower.get";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowerGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowerGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
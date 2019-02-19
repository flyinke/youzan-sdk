package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsGetParams;

public class YouzanUsersWeixinFollowerTagsGet extends AbstractAPI {

    public YouzanUsersWeixinFollowerTagsGet() {
    }

    public YouzanUsersWeixinFollowerTagsGet(YouzanUsersWeixinFollowerTagsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.follower.tags.get";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowerTagsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowerTagsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowerTagsDeleteParams;

public class YouzanUsersWeixinFollowerTagsDelete extends AbstractAPI {

    public YouzanUsersWeixinFollowerTagsDelete() {
    }

    public YouzanUsersWeixinFollowerTagsDelete(YouzanUsersWeixinFollowerTagsDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.follower.tags.delete";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowerTagsDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowerTagsDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
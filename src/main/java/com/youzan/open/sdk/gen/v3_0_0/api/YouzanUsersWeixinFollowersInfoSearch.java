package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersInfoSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUsersWeixinFollowersInfoSearchParams;

public class YouzanUsersWeixinFollowersInfoSearch extends AbstractAPI {

    public YouzanUsersWeixinFollowersInfoSearch() {
    }

    public YouzanUsersWeixinFollowersInfoSearch(YouzanUsersWeixinFollowersInfoSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.users.weixin.followers.info.search";
    }

    public Class getResultModelClass() {
        return YouzanUsersWeixinFollowersInfoSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersWeixinFollowersInfoSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserWeixinOpenidGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserWeixinOpenidGetParams;

public class YouzanUserWeixinOpenidGet extends AbstractAPI {

    public YouzanUserWeixinOpenidGet() {
    }

    public YouzanUserWeixinOpenidGet(YouzanUserWeixinOpenidGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.user.weixin.openid.get";
    }

    public Class getResultModelClass() {
        return YouzanUserWeixinOpenidGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUserWeixinOpenidGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
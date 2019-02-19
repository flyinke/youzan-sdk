package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUsersAccountCheckResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUsersAccountCheckParams;

public class YouzanUsersAccountCheck extends AbstractAPI {

    public YouzanUsersAccountCheck() {
    }

    public YouzanUsersAccountCheck(YouzanUsersAccountCheckParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.users.account.check";
    }

    public Class getResultModelClass() {
        return YouzanUsersAccountCheckResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUsersAccountCheckParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
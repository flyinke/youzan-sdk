package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeGetParams;

public class YouzanMeiDeptSecurityCodeGet extends AbstractAPI {

    public YouzanMeiDeptSecurityCodeGet() {
    }

    public YouzanMeiDeptSecurityCodeGet(YouzanMeiDeptSecurityCodeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.security.code.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptSecurityCodeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptSecurityCodeGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
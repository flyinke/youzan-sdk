package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeUpdateParams;

public class YouzanMeiDeptSecurityCodeUpdate extends AbstractAPI {

    public YouzanMeiDeptSecurityCodeUpdate() {
    }

    public YouzanMeiDeptSecurityCodeUpdate(YouzanMeiDeptSecurityCodeUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.security.code.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptSecurityCodeUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptSecurityCodeUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
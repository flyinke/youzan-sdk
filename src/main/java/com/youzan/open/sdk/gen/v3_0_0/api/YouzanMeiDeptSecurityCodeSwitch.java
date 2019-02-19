package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeSwitchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptSecurityCodeSwitchParams;

public class YouzanMeiDeptSecurityCodeSwitch extends AbstractAPI {

    public YouzanMeiDeptSecurityCodeSwitch() {
    }

    public YouzanMeiDeptSecurityCodeSwitch(YouzanMeiDeptSecurityCodeSwitchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.security.code.switch";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptSecurityCodeSwitchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptSecurityCodeSwitchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
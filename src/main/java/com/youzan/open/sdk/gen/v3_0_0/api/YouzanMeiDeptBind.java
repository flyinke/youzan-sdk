package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptBindResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptBindParams;

public class YouzanMeiDeptBind extends AbstractAPI {

    public YouzanMeiDeptBind() {
    }

    public YouzanMeiDeptBind(YouzanMeiDeptBindParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.bind";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptBindResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptBindParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
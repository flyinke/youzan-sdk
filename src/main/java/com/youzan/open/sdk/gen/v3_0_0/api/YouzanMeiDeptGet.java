package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptGetParams;

public class YouzanMeiDeptGet extends AbstractAPI {

    public YouzanMeiDeptGet() {
    }

    public YouzanMeiDeptGet(YouzanMeiDeptGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
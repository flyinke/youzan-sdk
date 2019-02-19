package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptStatusGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptStatusGetParams;

public class YouzanMeiDeptStatusGet extends AbstractAPI {

    public YouzanMeiDeptStatusGet() {
    }

    public YouzanMeiDeptStatusGet(YouzanMeiDeptStatusGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.status.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptStatusGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptStatusGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
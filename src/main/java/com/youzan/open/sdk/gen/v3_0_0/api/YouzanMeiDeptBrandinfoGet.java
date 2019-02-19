package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptBrandinfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiDeptBrandinfoGetParams;

public class YouzanMeiDeptBrandinfoGet extends AbstractAPI {

    public YouzanMeiDeptBrandinfoGet() {
    }

    public YouzanMeiDeptBrandinfoGet(YouzanMeiDeptBrandinfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.dept.brandinfo.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiDeptBrandinfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiDeptBrandinfoGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
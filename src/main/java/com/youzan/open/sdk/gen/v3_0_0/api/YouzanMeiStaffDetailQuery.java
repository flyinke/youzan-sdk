package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffDetailQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffDetailQueryParams;

public class YouzanMeiStaffDetailQuery extends AbstractAPI {

    public YouzanMeiStaffDetailQuery() {
    }

    public YouzanMeiStaffDetailQuery(YouzanMeiStaffDetailQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.detail.query";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffDetailQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffDetailQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
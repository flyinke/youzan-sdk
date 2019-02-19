package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffPageQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiStaffPageQueryParams;

public class YouzanMeiStaffPageQuery extends AbstractAPI {

    public YouzanMeiStaffPageQuery() {
    }

    public YouzanMeiStaffPageQuery(YouzanMeiStaffPageQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.staff.page.query";
    }

    public Class getResultModelClass() {
        return YouzanMeiStaffPageQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiStaffPageQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
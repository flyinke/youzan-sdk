package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpMemberpriceQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpMemberpriceQueryParams;

public class YouzanUmpMemberpriceQuery extends AbstractAPI {

    public YouzanUmpMemberpriceQuery() {
    }

    public YouzanUmpMemberpriceQuery(YouzanUmpMemberpriceQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.memberprice.query";
    }

    public Class getResultModelClass() {
        return YouzanUmpMemberpriceQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpMemberpriceQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
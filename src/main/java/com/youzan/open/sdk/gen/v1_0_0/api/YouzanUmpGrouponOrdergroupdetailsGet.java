package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpGrouponOrdergroupdetailsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpGrouponOrdergroupdetailsGetParams;

public class YouzanUmpGrouponOrdergroupdetailsGet extends AbstractAPI {

    public YouzanUmpGrouponOrdergroupdetailsGet() {
    }

    public YouzanUmpGrouponOrdergroupdetailsGet(YouzanUmpGrouponOrdergroupdetailsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.groupon.ordergroupdetails.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpGrouponOrdergroupdetailsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpGrouponOrdergroupdetailsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
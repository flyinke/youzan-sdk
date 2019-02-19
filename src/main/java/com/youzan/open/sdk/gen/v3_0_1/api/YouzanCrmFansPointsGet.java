package com.youzan.open.sdk.gen.v3_0_1.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmFansPointsGetResult;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmFansPointsGetParams;

public class YouzanCrmFansPointsGet extends AbstractAPI {

    public YouzanCrmFansPointsGet() {
    }

    public YouzanCrmFansPointsGet(YouzanCrmFansPointsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.1";
    }

    public String getName() {
        return "youzan.crm.fans.points.get";
    }

    public Class getResultModelClass() {
        return YouzanCrmFansPointsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmFansPointsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
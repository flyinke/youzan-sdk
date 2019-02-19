package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderQueryParams;

public class YouzanMeiOrderQuery extends AbstractAPI {

    public YouzanMeiOrderQuery() {
    }

    public YouzanMeiOrderQuery(YouzanMeiOrderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.order.query";
    }

    public Class getResultModelClass() {
        return YouzanMeiOrderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiOrderQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
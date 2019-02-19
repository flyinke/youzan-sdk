package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountDetailQueryResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountDetailQueryParams;

public class YouzanUmpLimitdiscountDetailQuery extends AbstractAPI {

    public YouzanUmpLimitdiscountDetailQuery() {
    }

    public YouzanUmpLimitdiscountDetailQuery(YouzanUmpLimitdiscountDetailQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.limitdiscount.detail.query";
    }

    public Class getResultModelClass() {
        return YouzanUmpLimitdiscountDetailQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpLimitdiscountDetailQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
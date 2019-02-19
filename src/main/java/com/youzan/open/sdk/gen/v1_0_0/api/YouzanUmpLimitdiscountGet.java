package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpLimitdiscountGetParams;

public class YouzanUmpLimitdiscountGet extends AbstractAPI {

    public YouzanUmpLimitdiscountGet() {
    }

    public YouzanUmpLimitdiscountGet(YouzanUmpLimitdiscountGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.limitdiscount.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpLimitdiscountGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpLimitdiscountGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
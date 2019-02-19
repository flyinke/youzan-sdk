package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsLocalGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsLocalGetParams;

public class YouzanLogisticsLocalGet extends AbstractAPI {

    public YouzanLogisticsLocalGet() {
    }

    public YouzanLogisticsLocalGet(YouzanLogisticsLocalGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.local.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsLocalGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsLocalGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
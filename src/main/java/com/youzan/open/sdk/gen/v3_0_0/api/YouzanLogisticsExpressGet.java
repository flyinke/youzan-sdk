package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressGetParams;

public class YouzanLogisticsExpressGet extends AbstractAPI {

    public YouzanLogisticsExpressGet() {
    }

    public YouzanLogisticsExpressGet(YouzanLogisticsExpressGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.express.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsExpressGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsExpressGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
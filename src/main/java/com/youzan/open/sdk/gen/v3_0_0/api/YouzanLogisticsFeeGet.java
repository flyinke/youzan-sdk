package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsFeeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsFeeGetParams;

public class YouzanLogisticsFeeGet extends AbstractAPI {

    public YouzanLogisticsFeeGet() {
    }

    public YouzanLogisticsFeeGet(YouzanLogisticsFeeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.fee.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsFeeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsFeeGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
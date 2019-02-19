package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderCancelResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderCancelParams;

public class YouzanMeiOrderCancel extends AbstractAPI {

    public YouzanMeiOrderCancel() {
    }

    public YouzanMeiOrderCancel(YouzanMeiOrderCancelParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.order.cancel";
    }

    public Class getResultModelClass() {
        return YouzanMeiOrderCancelResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiOrderCancelParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
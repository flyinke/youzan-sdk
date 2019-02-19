package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderUpdateParams;

public class YouzanMeiOrderUpdate extends AbstractAPI {

    public YouzanMeiOrderUpdate() {
    }

    public YouzanMeiOrderUpdate(YouzanMeiOrderUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.order.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiOrderUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiOrderUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderCreateParams;

public class YouzanMeiOrderCreate extends AbstractAPI {

    public YouzanMeiOrderCreate() {
    }

    public YouzanMeiOrderCreate(YouzanMeiOrderCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.order.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiOrderCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiOrderCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
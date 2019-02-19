package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSpuCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSpuCreateParams;

public class YouzanRetailOpenSpuCreate extends AbstractAPI {

    public YouzanRetailOpenSpuCreate() {
    }

    public YouzanRetailOpenSpuCreate(YouzanRetailOpenSpuCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.spu.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSpuCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSpuCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
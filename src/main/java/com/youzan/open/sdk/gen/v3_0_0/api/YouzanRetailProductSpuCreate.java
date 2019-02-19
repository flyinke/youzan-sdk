package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuCreateParams;

public class YouzanRetailProductSpuCreate extends AbstractAPI {

    public YouzanRetailProductSpuCreate() {
    }

    public YouzanRetailProductSpuCreate(YouzanRetailProductSpuCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spu.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpuCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpuCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
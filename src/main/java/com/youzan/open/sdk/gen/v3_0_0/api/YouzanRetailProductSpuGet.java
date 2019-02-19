package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuGetParams;

public class YouzanRetailProductSpuGet extends AbstractAPI {

    public YouzanRetailProductSpuGet() {
    }

    public YouzanRetailProductSpuGet(YouzanRetailProductSpuGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spu.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpuGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpuGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
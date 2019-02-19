package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSkuGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSkuGetParams;

public class YouzanItemSkuGet extends AbstractAPI {

    public YouzanItemSkuGet() {
    }

    public YouzanItemSkuGet(YouzanItemSkuGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.sku.get";
    }

    public Class getResultModelClass() {
        return YouzanItemSkuGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemSkuGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
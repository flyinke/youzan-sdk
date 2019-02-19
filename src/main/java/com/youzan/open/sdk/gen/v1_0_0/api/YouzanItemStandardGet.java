package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardGetParams;

public class YouzanItemStandardGet extends AbstractAPI {

    public YouzanItemStandardGet() {
    }

    public YouzanItemStandardGet(YouzanItemStandardGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.item.standard.get";
    }

    public Class getResultModelClass() {
        return YouzanItemStandardGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemStandardGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
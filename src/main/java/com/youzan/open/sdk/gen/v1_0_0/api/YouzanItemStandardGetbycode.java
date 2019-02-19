package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardGetbycodeResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanItemStandardGetbycodeParams;

public class YouzanItemStandardGetbycode extends AbstractAPI {

    public YouzanItemStandardGetbycode() {
    }

    public YouzanItemStandardGetbycode(YouzanItemStandardGetbycodeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.item.standard.getbycode";
    }

    public Class getResultModelClass() {
        return YouzanItemStandardGetbycodeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemStandardGetbycodeParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
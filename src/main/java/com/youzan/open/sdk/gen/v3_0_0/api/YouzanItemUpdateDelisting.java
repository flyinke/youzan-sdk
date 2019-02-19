package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateDelistingResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateDelistingParams;

public class YouzanItemUpdateDelisting extends AbstractAPI {

    public YouzanItemUpdateDelisting() {
    }

    public YouzanItemUpdateDelisting(YouzanItemUpdateDelistingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.update.delisting";
    }

    public Class getResultModelClass() {
        return YouzanItemUpdateDelistingResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemUpdateDelistingParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
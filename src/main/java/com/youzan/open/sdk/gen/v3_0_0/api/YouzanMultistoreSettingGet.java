package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreSettingGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreSettingGetParams;

public class YouzanMultistoreSettingGet extends AbstractAPI {

    public YouzanMultistoreSettingGet() {
    }

    public YouzanMultistoreSettingGet(YouzanMultistoreSettingGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.setting.get";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreSettingGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreSettingGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
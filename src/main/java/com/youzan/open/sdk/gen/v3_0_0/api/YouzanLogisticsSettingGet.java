package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsSettingGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsSettingGetParams;

public class YouzanLogisticsSettingGet extends AbstractAPI {

    public YouzanLogisticsSettingGet() {
    }

    public YouzanLogisticsSettingGet(YouzanLogisticsSettingGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.setting.get";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsSettingGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsSettingGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
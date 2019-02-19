package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsSettingUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsSettingUpdateParams;

public class YouzanLogisticsSettingUpdate extends AbstractAPI {

    public YouzanLogisticsSettingUpdate() {
    }

    public YouzanLogisticsSettingUpdate(YouzanLogisticsSettingUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.setting.update";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsSettingUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsSettingUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
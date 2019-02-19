package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSettingUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSettingUpdateParams;

public class YouzanMeiCustomerSettingUpdate extends AbstractAPI {

    public YouzanMeiCustomerSettingUpdate() {
    }

    public YouzanMeiCustomerSettingUpdate(YouzanMeiCustomerSettingUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.setting.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerSettingUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerSettingUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
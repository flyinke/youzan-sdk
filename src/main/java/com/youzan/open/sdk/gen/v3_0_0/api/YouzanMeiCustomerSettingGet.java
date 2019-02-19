package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSettingGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSettingGetParams;

public class YouzanMeiCustomerSettingGet extends AbstractAPI {

    public YouzanMeiCustomerSettingGet() {
    }

    public YouzanMeiCustomerSettingGet(YouzanMeiCustomerSettingGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.setting.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerSettingGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerSettingGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
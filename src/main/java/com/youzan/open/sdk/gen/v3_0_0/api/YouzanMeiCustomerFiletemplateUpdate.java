package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFiletemplateUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFiletemplateUpdateParams;

public class YouzanMeiCustomerFiletemplateUpdate extends AbstractAPI {

    public YouzanMeiCustomerFiletemplateUpdate() {
    }

    public YouzanMeiCustomerFiletemplateUpdate(YouzanMeiCustomerFiletemplateUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.filetemplate.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerFiletemplateUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerFiletemplateUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
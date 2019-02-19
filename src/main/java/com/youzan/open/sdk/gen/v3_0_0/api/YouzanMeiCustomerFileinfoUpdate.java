package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFileinfoUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerFileinfoUpdateParams;

public class YouzanMeiCustomerFileinfoUpdate extends AbstractAPI {

    public YouzanMeiCustomerFileinfoUpdate() {
    }

    public YouzanMeiCustomerFileinfoUpdate(YouzanMeiCustomerFileinfoUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.fileinfo.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerFileinfoUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerFileinfoUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
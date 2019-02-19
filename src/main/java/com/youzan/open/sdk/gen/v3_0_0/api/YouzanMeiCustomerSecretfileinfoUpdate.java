package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSecretfileinfoUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerSecretfileinfoUpdateParams;

public class YouzanMeiCustomerSecretfileinfoUpdate extends AbstractAPI {

    public YouzanMeiCustomerSecretfileinfoUpdate() {
    }

    public YouzanMeiCustomerSecretfileinfoUpdate(YouzanMeiCustomerSecretfileinfoUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.secretfileinfo.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerSecretfileinfoUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerSecretfileinfoUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
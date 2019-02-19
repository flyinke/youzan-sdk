package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineCreateParams;

public class YouzanRetailProductOfflineCreate extends AbstractAPI {

    public YouzanRetailProductOfflineCreate() {
    }

    public YouzanRetailProductOfflineCreate(YouzanRetailProductOfflineCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.offline.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOfflineCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOfflineCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineCreateParams;

public class YouzanRetailProductOnlineCreate extends AbstractAPI {

    public YouzanRetailProductOnlineCreate() {
    }

    public YouzanRetailProductOnlineCreate(YouzanRetailProductOnlineCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.online.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOnlineCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOnlineCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
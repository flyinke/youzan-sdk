package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineGetParams;

public class YouzanRetailProductOnlineGet extends AbstractAPI {

    public YouzanRetailProductOnlineGet() {
    }

    public YouzanRetailProductOnlineGet(YouzanRetailProductOnlineGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.online.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOnlineGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOnlineGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
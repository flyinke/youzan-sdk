package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineGetParams;

public class YouzanRetailProductOfflineGet extends AbstractAPI {

    public YouzanRetailProductOfflineGet() {
    }

    public YouzanRetailProductOfflineGet(YouzanRetailProductOfflineGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.offline.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOfflineGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOfflineGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
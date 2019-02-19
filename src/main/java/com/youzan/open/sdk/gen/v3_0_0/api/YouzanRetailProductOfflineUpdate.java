package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOfflineUpdateParams;

public class YouzanRetailProductOfflineUpdate extends AbstractAPI {

    public YouzanRetailProductOfflineUpdate() {
    }

    public YouzanRetailProductOfflineUpdate(YouzanRetailProductOfflineUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.offline.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOfflineUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOfflineUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
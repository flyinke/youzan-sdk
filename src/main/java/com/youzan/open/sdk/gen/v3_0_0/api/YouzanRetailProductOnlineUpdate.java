package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductOnlineUpdateParams;

public class YouzanRetailProductOnlineUpdate extends AbstractAPI {

    public YouzanRetailProductOnlineUpdate() {
    }

    public YouzanRetailProductOnlineUpdate(YouzanRetailProductOnlineUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.online.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductOnlineUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductOnlineUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
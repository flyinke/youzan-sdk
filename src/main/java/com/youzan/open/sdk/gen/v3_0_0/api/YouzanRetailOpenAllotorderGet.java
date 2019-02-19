package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenAllotorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenAllotorderGetParams;

public class YouzanRetailOpenAllotorderGet extends AbstractAPI {

    public YouzanRetailOpenAllotorderGet() {
    }

    public YouzanRetailOpenAllotorderGet(YouzanRetailOpenAllotorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.allotorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenAllotorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenAllotorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
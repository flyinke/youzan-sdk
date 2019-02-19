package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderGetParams;

public class YouzanRetailOpenReturnorderGet extends AbstractAPI {

    public YouzanRetailOpenReturnorderGet() {
    }

    public YouzanRetailOpenReturnorderGet(YouzanRetailOpenReturnorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.returnorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenReturnorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenReturnorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderRefuseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderRefuseParams;

public class YouzanRetailOpenReturnorderRefuse extends AbstractAPI {

    public YouzanRetailOpenReturnorderRefuse() {
    }

    public YouzanRetailOpenReturnorderRefuse(YouzanRetailOpenReturnorderRefuseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.returnorder.refuse";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenReturnorderRefuseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenReturnorderRefuseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
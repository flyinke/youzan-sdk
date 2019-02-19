package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardAddParams;

public class YouzanUmpPromocardAdd extends AbstractAPI {

    public YouzanUmpPromocardAdd() {
    }

    public YouzanUmpPromocardAdd(YouzanUmpPromocardAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promocard.add";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromocardAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromocardAddParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
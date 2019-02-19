package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeAddParams;

public class YouzanUmpPromocodeAdd extends AbstractAPI {

    public YouzanUmpPromocodeAdd() {
    }

    public YouzanUmpPromocodeAdd(YouzanUmpPromocodeAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promocode.add";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromocodeAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromocodeAddParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
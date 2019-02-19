package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeDetailGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeDetailGetParams;

public class YouzanUmpPromocodeDetailGet extends AbstractAPI {

    public YouzanUmpPromocodeDetailGet() {
    }

    public YouzanUmpPromocodeDetailGet(YouzanUmpPromocodeDetailGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promocode.detail.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromocodeDetailGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromocodeDetailGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
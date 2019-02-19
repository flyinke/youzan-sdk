package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSpuQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSpuQueryParams;

public class YouzanRetailOpenSpuQuery extends AbstractAPI {

    public YouzanRetailOpenSpuQuery() {
    }

    public YouzanRetailOpenSpuQuery(YouzanRetailOpenSpuQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.spu.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSpuQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSpuQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
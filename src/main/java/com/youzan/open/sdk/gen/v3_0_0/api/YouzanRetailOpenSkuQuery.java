package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSkuQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenSkuQueryParams;

public class YouzanRetailOpenSkuQuery extends AbstractAPI {

    public YouzanRetailOpenSkuQuery() {
    }

    public YouzanRetailOpenSkuQuery(YouzanRetailOpenSkuQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.sku.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenSkuQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenSkuQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
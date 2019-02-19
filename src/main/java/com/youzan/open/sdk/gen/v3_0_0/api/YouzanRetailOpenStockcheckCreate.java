package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockcheckCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockcheckCreateParams;

public class YouzanRetailOpenStockcheckCreate extends AbstractAPI {

    public YouzanRetailOpenStockcheckCreate() {
    }

    public YouzanRetailOpenStockcheckCreate(YouzanRetailOpenStockcheckCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockcheck.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockcheckCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockcheckCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
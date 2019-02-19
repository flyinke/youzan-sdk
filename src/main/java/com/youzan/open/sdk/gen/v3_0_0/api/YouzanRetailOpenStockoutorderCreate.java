package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderCreateParams;

public class YouzanRetailOpenStockoutorderCreate extends AbstractAPI {

    public YouzanRetailOpenStockoutorderCreate() {
    }

    public YouzanRetailOpenStockoutorderCreate(YouzanRetailOpenStockoutorderCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockoutorder.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockoutorderCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockoutorderCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
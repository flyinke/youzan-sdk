package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderGetParams;

public class YouzanRetailOpenStockoutorderGet extends AbstractAPI {

    public YouzanRetailOpenStockoutorderGet() {
    }

    public YouzanRetailOpenStockoutorderGet(YouzanRetailOpenStockoutorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockoutorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockoutorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockoutorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
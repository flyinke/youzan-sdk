package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockoutorderQueryParams;

public class YouzanRetailOpenStockoutorderQuery extends AbstractAPI {

    public YouzanRetailOpenStockoutorderQuery() {
    }

    public YouzanRetailOpenStockoutorderQuery(YouzanRetailOpenStockoutorderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockoutorder.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockoutorderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockoutorderQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
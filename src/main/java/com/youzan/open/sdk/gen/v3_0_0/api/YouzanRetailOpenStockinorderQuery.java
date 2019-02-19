package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderQueryParams;

public class YouzanRetailOpenStockinorderQuery extends AbstractAPI {

    public YouzanRetailOpenStockinorderQuery() {
    }

    public YouzanRetailOpenStockinorderQuery(YouzanRetailOpenStockinorderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockinorder.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockinorderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockinorderQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
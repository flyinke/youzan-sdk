package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderCreateParams;

public class YouzanRetailOpenStockinorderCreate extends AbstractAPI {

    public YouzanRetailOpenStockinorderCreate() {
    }

    public YouzanRetailOpenStockinorderCreate(YouzanRetailOpenStockinorderCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockinorder.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockinorderCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockinorderCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
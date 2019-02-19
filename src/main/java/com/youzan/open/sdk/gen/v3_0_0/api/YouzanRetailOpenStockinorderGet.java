package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenStockinorderGetParams;

public class YouzanRetailOpenStockinorderGet extends AbstractAPI {

    public YouzanRetailOpenStockinorderGet() {
    }

    public YouzanRetailOpenStockinorderGet(YouzanRetailOpenStockinorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.stockinorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenStockinorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenStockinorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenReturnorderQueryParams;

public class YouzanRetailOpenReturnorderQuery extends AbstractAPI {

    public YouzanRetailOpenReturnorderQuery() {
    }

    public YouzanRetailOpenReturnorderQuery(YouzanRetailOpenReturnorderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.returnorder.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenReturnorderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenReturnorderQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
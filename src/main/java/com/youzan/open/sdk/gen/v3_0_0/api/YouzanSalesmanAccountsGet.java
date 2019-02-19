package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountsGetParams;

public class YouzanSalesmanAccountsGet extends AbstractAPI {

    public YouzanSalesmanAccountsGet() {
    }

    public YouzanSalesmanAccountsGet(YouzanSalesmanAccountsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.accounts.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanAccountsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanAccountsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
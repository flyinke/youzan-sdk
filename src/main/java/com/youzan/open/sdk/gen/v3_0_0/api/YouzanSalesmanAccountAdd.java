package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountAddParams;

public class YouzanSalesmanAccountAdd extends AbstractAPI {

    public YouzanSalesmanAccountAdd() {
    }

    public YouzanSalesmanAccountAdd(YouzanSalesmanAccountAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.account.add";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanAccountAddResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanAccountAddParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
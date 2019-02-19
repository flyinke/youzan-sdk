package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanCustomersGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanCustomersGetParams;

public class YouzanSalesmanCustomersGet extends AbstractAPI {

    public YouzanSalesmanCustomersGet() {
    }

    public YouzanSalesmanCustomersGet(YouzanSalesmanCustomersGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.customers.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanCustomersGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanCustomersGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountGetParams;

public class YouzanSalesmanAccountGet extends AbstractAPI {

    public YouzanSalesmanAccountGet() {
    }

    public YouzanSalesmanAccountGet(YouzanSalesmanAccountGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.account.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanAccountGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanAccountGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
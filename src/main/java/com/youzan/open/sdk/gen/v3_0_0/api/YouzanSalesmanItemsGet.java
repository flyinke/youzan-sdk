package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanItemsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanItemsGetParams;

public class YouzanSalesmanItemsGet extends AbstractAPI {

    public YouzanSalesmanItemsGet() {
    }

    public YouzanSalesmanItemsGet(YouzanSalesmanItemsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.items.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanItemsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanItemsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
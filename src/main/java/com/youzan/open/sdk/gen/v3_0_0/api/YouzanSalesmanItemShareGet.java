package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanItemShareGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanItemShareGetParams;

public class YouzanSalesmanItemShareGet extends AbstractAPI {

    public YouzanSalesmanItemShareGet() {
    }

    public YouzanSalesmanItemShareGet(YouzanSalesmanItemShareGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.item.share.get";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanItemShareGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanItemShareGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
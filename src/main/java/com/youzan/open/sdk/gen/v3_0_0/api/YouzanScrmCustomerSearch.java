package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerSearchParams;

public class YouzanScrmCustomerSearch extends AbstractAPI {

    public YouzanScrmCustomerSearch() {
    }

    public YouzanScrmCustomerSearch(YouzanScrmCustomerSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.search";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
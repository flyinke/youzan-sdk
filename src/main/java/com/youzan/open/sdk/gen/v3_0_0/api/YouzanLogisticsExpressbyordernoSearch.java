package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressbyordernoSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressbyordernoSearchParams;

public class YouzanLogisticsExpressbyordernoSearch extends AbstractAPI {

    public YouzanLogisticsExpressbyordernoSearch() {
    }

    public YouzanLogisticsExpressbyordernoSearch(YouzanLogisticsExpressbyordernoSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.logistics.expressbyorderno.search";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsExpressbyordernoSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsExpressbyordernoSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
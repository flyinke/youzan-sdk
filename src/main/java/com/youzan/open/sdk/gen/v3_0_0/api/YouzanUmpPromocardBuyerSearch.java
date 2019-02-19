package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardBuyerSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardBuyerSearchParams;

public class YouzanUmpPromocardBuyerSearch extends AbstractAPI {

    public YouzanUmpPromocardBuyerSearch() {
    }

    public YouzanUmpPromocardBuyerSearch(YouzanUmpPromocardBuyerSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promocard.buyer.search";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromocardBuyerSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromocardBuyerSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
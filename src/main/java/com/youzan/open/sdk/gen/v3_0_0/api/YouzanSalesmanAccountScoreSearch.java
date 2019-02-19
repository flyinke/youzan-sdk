package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountScoreSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSalesmanAccountScoreSearchParams;

public class YouzanSalesmanAccountScoreSearch extends AbstractAPI {

    public YouzanSalesmanAccountScoreSearch() {
    }

    public YouzanSalesmanAccountScoreSearch(YouzanSalesmanAccountScoreSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.salesman.account.score.search";
    }

    public Class getResultModelClass() {
        return YouzanSalesmanAccountScoreSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanSalesmanAccountScoreSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
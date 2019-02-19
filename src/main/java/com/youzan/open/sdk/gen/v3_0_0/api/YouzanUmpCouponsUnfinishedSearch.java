package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponsUnfinishedSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponsUnfinishedSearchParams;

public class YouzanUmpCouponsUnfinishedSearch extends AbstractAPI {

    public YouzanUmpCouponsUnfinishedSearch() {
    }

    public YouzanUmpCouponsUnfinishedSearch(YouzanUmpCouponsUnfinishedSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupons.unfinished.search";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponsUnfinishedSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponsUnfinishedSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
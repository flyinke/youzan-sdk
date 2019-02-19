package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponSearchParams;

public class YouzanUmpCouponSearch extends AbstractAPI {

    public YouzanUmpCouponSearch() {
    }

    public YouzanUmpCouponSearch(YouzanUmpCouponSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.search";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
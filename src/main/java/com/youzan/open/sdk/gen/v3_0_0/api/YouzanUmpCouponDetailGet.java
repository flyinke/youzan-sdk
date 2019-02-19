package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponDetailGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponDetailGetParams;

public class YouzanUmpCouponDetailGet extends AbstractAPI {

    public YouzanUmpCouponDetailGet() {
    }

    public YouzanUmpCouponDetailGet(YouzanUmpCouponDetailGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.detail.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponDetailGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponDetailGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeFetchlogsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeFetchlogsGetParams;

public class YouzanUmpCouponConsumeFetchlogsGet extends AbstractAPI {

    public YouzanUmpCouponConsumeFetchlogsGet() {
    }

    public YouzanUmpCouponConsumeFetchlogsGet(YouzanUmpCouponConsumeFetchlogsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.consume.fetchlogs.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponConsumeFetchlogsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponConsumeFetchlogsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeGetParams;

public class YouzanUmpCouponConsumeGet extends AbstractAPI {

    public YouzanUmpCouponConsumeGet() {
    }

    public YouzanUmpCouponConsumeGet(YouzanUmpCouponConsumeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.consume.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponConsumeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponConsumeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
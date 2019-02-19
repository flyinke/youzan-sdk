package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeVerifylogsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeVerifylogsGetParams;

public class YouzanUmpCouponConsumeVerifylogsGet extends AbstractAPI {

    public YouzanUmpCouponConsumeVerifylogsGet() {
    }

    public YouzanUmpCouponConsumeVerifylogsGet(YouzanUmpCouponConsumeVerifylogsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.consume.verifylogs.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponConsumeVerifylogsGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponConsumeVerifylogsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeVerifyResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeVerifyParams;

public class YouzanUmpCouponConsumeVerify extends AbstractAPI {

    public YouzanUmpCouponConsumeVerify() {
    }

    public YouzanUmpCouponConsumeVerify(YouzanUmpCouponConsumeVerifyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.consume.verify";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponConsumeVerifyResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponConsumeVerifyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
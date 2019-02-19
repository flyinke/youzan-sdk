package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponTakeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponTakeParams;

public class YouzanUmpCouponTake extends AbstractAPI {

    public YouzanUmpCouponTake() {
    }

    public YouzanUmpCouponTake(YouzanUmpCouponTakeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.coupon.take";
    }

    public Class getResultModelClass() {
        return YouzanUmpCouponTakeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpCouponTakeParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
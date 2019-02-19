package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromotionGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromotionGetParams;

public class YouzanUmpPromotionGet extends AbstractAPI {

    public YouzanUmpPromotionGet() {
    }

    public YouzanUmpPromotionGet(YouzanUmpPromotionGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.ump.promotion.get";
    }

    public Class getResultModelClass() {
        return YouzanUmpPromotionGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpPromotionGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
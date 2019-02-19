package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterCreateParams;

public class YouzanMeiPromoterCreate extends AbstractAPI {

    public YouzanMeiPromoterCreate() {
    }

    public YouzanMeiPromoterCreate(YouzanMeiPromoterCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
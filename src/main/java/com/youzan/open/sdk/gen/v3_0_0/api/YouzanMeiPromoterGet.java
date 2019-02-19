package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterGetParams;

public class YouzanMeiPromoterGet extends AbstractAPI {

    public YouzanMeiPromoterGet() {
    }

    public YouzanMeiPromoterGet(YouzanMeiPromoterGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterListParams;

public class YouzanMeiPromoterList extends AbstractAPI {

    public YouzanMeiPromoterList() {
    }

    public YouzanMeiPromoterList(YouzanMeiPromoterListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
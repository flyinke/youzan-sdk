package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCardListParams;

public class YouzanMeiCardList extends AbstractAPI {

    public YouzanMeiCardList() {
    }

    public YouzanMeiCardList(YouzanMeiCardListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.card.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiCardListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCardListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCardListParams;

public class YouzanScrmCardList extends AbstractAPI {

    public YouzanScrmCardList() {
    }

    public YouzanScrmCardList(YouzanScrmCardListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.card.list";
    }

    public Class getResultModelClass() {
        return YouzanScrmCardListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCardListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
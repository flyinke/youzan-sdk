package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSingleskuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMultistoreGoodsSingleskuUpdateParams;

public class YouzanMultistoreGoodsSingleskuUpdate extends AbstractAPI {

    public YouzanMultistoreGoodsSingleskuUpdate() {
    }

    public YouzanMultistoreGoodsSingleskuUpdate(YouzanMultistoreGoodsSingleskuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.multistore.goods.singlesku.update";
    }

    public Class getResultModelClass() {
        return YouzanMultistoreGoodsSingleskuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMultistoreGoodsSingleskuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
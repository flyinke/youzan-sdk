package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsShelveUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsShelveUpdateParams;

public class YouzanMeiGoodsShelveUpdate extends AbstractAPI {

    public YouzanMeiGoodsShelveUpdate() {
    }

    public YouzanMeiGoodsShelveUpdate(YouzanMeiGoodsShelveUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.shelve.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsShelveUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsShelveUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
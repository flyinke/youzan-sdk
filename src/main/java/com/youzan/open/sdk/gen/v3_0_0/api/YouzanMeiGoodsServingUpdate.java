package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingUpdateParams;

public class YouzanMeiGoodsServingUpdate extends AbstractAPI {

    public YouzanMeiGoodsServingUpdate() {
    }

    public YouzanMeiGoodsServingUpdate(YouzanMeiGoodsServingUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
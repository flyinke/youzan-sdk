package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagUpdateParams;

public class YouzanMeiGoodsServingTagUpdate extends AbstractAPI {

    public YouzanMeiGoodsServingTagUpdate() {
    }

    public YouzanMeiGoodsServingTagUpdate(YouzanMeiGoodsServingTagUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.tag.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingTagUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingTagUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagDeleteParams;

public class YouzanMeiGoodsServingTagDelete extends AbstractAPI {

    public YouzanMeiGoodsServingTagDelete() {
    }

    public YouzanMeiGoodsServingTagDelete(YouzanMeiGoodsServingTagDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.tag.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingTagDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingTagDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
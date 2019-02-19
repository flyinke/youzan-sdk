package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsServingTagListParams;

public class YouzanMeiGoodsServingTagList extends AbstractAPI {

    public YouzanMeiGoodsServingTagList() {
    }

    public YouzanMeiGoodsServingTagList(YouzanMeiGoodsServingTagListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.serving.tag.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsServingTagListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsServingTagListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
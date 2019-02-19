package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagListParams;

public class YouzanMeiGoodsProductTagList extends AbstractAPI {

    public YouzanMeiGoodsProductTagList() {
    }

    public YouzanMeiGoodsProductTagList(YouzanMeiGoodsProductTagListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.tag.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductTagListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductTagListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
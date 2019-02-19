package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagCreateParams;

public class YouzanMeiGoodsProductTagCreate extends AbstractAPI {

    public YouzanMeiGoodsProductTagCreate() {
    }

    public YouzanMeiGoodsProductTagCreate(YouzanMeiGoodsProductTagCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.tag.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductTagCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductTagCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
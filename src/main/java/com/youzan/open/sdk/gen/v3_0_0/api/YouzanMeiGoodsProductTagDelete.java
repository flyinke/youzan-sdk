package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagDeleteParams;

public class YouzanMeiGoodsProductTagDelete extends AbstractAPI {

    public YouzanMeiGoodsProductTagDelete() {
    }

    public YouzanMeiGoodsProductTagDelete(YouzanMeiGoodsProductTagDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.tag.delete";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductTagDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductTagDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
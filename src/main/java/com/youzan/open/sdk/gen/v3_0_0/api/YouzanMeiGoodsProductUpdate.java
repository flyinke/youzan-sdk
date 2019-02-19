package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductUpdateParams;

public class YouzanMeiGoodsProductUpdate extends AbstractAPI {

    public YouzanMeiGoodsProductUpdate() {
    }

    public YouzanMeiGoodsProductUpdate(YouzanMeiGoodsProductUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
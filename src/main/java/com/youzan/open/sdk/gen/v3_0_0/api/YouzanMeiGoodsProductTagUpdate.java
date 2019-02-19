package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiGoodsProductTagUpdateParams;

public class YouzanMeiGoodsProductTagUpdate extends AbstractAPI {

    public YouzanMeiGoodsProductTagUpdate() {
    }

    public YouzanMeiGoodsProductTagUpdate(YouzanMeiGoodsProductTagUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.goods.product.tag.update";
    }

    public Class getResultModelClass() {
        return YouzanMeiGoodsProductTagUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiGoodsProductTagUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
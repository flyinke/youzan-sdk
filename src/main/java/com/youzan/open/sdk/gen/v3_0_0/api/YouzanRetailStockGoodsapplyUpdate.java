package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyUpdateParams;

public class YouzanRetailStockGoodsapplyUpdate extends AbstractAPI {

    public YouzanRetailStockGoodsapplyUpdate() {
    }

    public YouzanRetailStockGoodsapplyUpdate(YouzanRetailStockGoodsapplyUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.goodsapply.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockGoodsapplyUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockGoodsapplyUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyGetParams;

public class YouzanRetailStockGoodsapplyGet extends AbstractAPI {

    public YouzanRetailStockGoodsapplyGet() {
    }

    public YouzanRetailStockGoodsapplyGet(YouzanRetailStockGoodsapplyGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.goodsapply.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockGoodsapplyGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockGoodsapplyGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
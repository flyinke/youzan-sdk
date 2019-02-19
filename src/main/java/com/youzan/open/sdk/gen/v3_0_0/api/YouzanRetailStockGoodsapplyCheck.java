package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyCheckResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyCheckParams;

public class YouzanRetailStockGoodsapplyCheck extends AbstractAPI {

    public YouzanRetailStockGoodsapplyCheck() {
    }

    public YouzanRetailStockGoodsapplyCheck(YouzanRetailStockGoodsapplyCheckParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.goodsapply.check";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockGoodsapplyCheckResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockGoodsapplyCheckParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
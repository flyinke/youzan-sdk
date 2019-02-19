package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyCloseResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplyCloseParams;

public class YouzanRetailStockGoodsapplyClose extends AbstractAPI {

    public YouzanRetailStockGoodsapplyClose() {
    }

    public YouzanRetailStockGoodsapplyClose(YouzanRetailStockGoodsapplyCloseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.goodsapply.close";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockGoodsapplyCloseResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockGoodsapplyCloseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
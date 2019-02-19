package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplySearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockGoodsapplySearchParams;

public class YouzanRetailStockGoodsapplySearch extends AbstractAPI {

    public YouzanRetailStockGoodsapplySearch() {
    }

    public YouzanRetailStockGoodsapplySearch(YouzanRetailStockGoodsapplySearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.goodsapply.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockGoodsapplySearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockGoodsapplySearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
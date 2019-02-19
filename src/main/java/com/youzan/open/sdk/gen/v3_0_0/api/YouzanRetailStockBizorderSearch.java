package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockBizorderSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockBizorderSearchParams;

public class YouzanRetailStockBizorderSearch extends AbstractAPI {

    public YouzanRetailStockBizorderSearch() {
    }

    public YouzanRetailStockBizorderSearch(YouzanRetailStockBizorderSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.bizorder.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockBizorderSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockBizorderSearchParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
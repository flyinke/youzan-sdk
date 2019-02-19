package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliverySearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliverySearchParams;

public class YouzanRetailStockDeliverySearch extends AbstractAPI {

    public YouzanRetailStockDeliverySearch() {
    }

    public YouzanRetailStockDeliverySearch(YouzanRetailStockDeliverySearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.delivery.search";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockDeliverySearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockDeliverySearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
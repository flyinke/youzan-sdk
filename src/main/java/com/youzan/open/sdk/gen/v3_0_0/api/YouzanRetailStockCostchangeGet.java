package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockCostchangeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockCostchangeGetParams;

public class YouzanRetailStockCostchangeGet extends AbstractAPI {

    public YouzanRetailStockCostchangeGet() {
    }

    public YouzanRetailStockCostchangeGet(YouzanRetailStockCostchangeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.costchange.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockCostchangeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockCostchangeGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
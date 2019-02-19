package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockCostchangeCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockCostchangeCreateParams;

public class YouzanRetailStockCostchangeCreate extends AbstractAPI {

    public YouzanRetailStockCostchangeCreate() {
    }

    public YouzanRetailStockCostchangeCreate(YouzanRetailStockCostchangeCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.costchange.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockCostchangeCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockCostchangeCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
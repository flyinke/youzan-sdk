package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockcheckUpdateParams;

public class YouzanRetailStockStockcheckUpdate extends AbstractAPI {

    public YouzanRetailStockStockcheckUpdate() {
    }

    public YouzanRetailStockStockcheckUpdate(YouzanRetailStockStockcheckUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockcheck.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockcheckUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockcheckUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
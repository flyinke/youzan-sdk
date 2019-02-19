package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockStockreturnCreateParams;

public class YouzanRetailStockStockreturnCreate extends AbstractAPI {

    public YouzanRetailStockStockreturnCreate() {
    }

    public YouzanRetailStockStockreturnCreate(YouzanRetailStockStockreturnCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.stockreturn.create";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockStockreturnCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockStockreturnCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
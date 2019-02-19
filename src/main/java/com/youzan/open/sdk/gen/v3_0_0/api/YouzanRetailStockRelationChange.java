package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockRelationChangeResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockRelationChangeParams;

public class YouzanRetailStockRelationChange extends AbstractAPI {

    public YouzanRetailStockRelationChange() {
    }

    public YouzanRetailStockRelationChange(YouzanRetailStockRelationChangeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.relation.change";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockRelationChangeResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockRelationChangeParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
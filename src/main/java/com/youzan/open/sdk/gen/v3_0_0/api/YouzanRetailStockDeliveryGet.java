package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryGetParams;

public class YouzanRetailStockDeliveryGet extends AbstractAPI {

    public YouzanRetailStockDeliveryGet() {
    }

    public YouzanRetailStockDeliveryGet(YouzanRetailStockDeliveryGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.delivery.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockDeliveryGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockDeliveryGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
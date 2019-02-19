package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryInResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryInParams;

public class YouzanRetailStockDeliveryIn extends AbstractAPI {

    public YouzanRetailStockDeliveryIn() {
    }

    public YouzanRetailStockDeliveryIn(YouzanRetailStockDeliveryInParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.delivery.in";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockDeliveryInResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockDeliveryInParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
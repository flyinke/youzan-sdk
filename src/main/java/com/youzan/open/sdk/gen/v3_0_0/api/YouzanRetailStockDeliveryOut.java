package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryOutResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailStockDeliveryOutParams;

public class YouzanRetailStockDeliveryOut extends AbstractAPI {

    public YouzanRetailStockDeliveryOut() {
    }

    public YouzanRetailStockDeliveryOut(YouzanRetailStockDeliveryOutParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.stock.delivery.out";
    }

    public Class getResultModelClass() {
        return YouzanRetailStockDeliveryOutResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailStockDeliveryOutParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
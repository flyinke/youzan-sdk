package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDeliveryorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDeliveryorderGetParams;

public class YouzanRetailOpenDeliveryorderGet extends AbstractAPI {

    public YouzanRetailOpenDeliveryorderGet() {
    }

    public YouzanRetailOpenDeliveryorderGet(YouzanRetailOpenDeliveryorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.deliveryorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenDeliveryorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenDeliveryorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
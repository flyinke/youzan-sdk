package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDeliveryorderQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDeliveryorderQueryParams;

public class YouzanRetailOpenDeliveryorderQuery extends AbstractAPI {

    public YouzanRetailOpenDeliveryorderQuery() {
    }

    public YouzanRetailOpenDeliveryorderQuery(YouzanRetailOpenDeliveryorderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.deliveryorder.query";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenDeliveryorderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenDeliveryorderQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
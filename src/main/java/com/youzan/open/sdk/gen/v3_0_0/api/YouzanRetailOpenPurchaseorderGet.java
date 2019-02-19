package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenPurchaseorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenPurchaseorderGetParams;

public class YouzanRetailOpenPurchaseorderGet extends AbstractAPI {

    public YouzanRetailOpenPurchaseorderGet() {
    }

    public YouzanRetailOpenPurchaseorderGet(YouzanRetailOpenPurchaseorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.purchaseorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenPurchaseorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenPurchaseorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
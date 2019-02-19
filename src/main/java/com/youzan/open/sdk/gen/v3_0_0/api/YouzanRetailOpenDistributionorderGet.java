package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDistributionorderGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailOpenDistributionorderGetParams;

public class YouzanRetailOpenDistributionorderGet extends AbstractAPI {

    public YouzanRetailOpenDistributionorderGet() {
    }

    public YouzanRetailOpenDistributionorderGet(YouzanRetailOpenDistributionorderGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.open.distributionorder.get";
    }

    public Class getResultModelClass() {
        return YouzanRetailOpenDistributionorderGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailOpenDistributionorderGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
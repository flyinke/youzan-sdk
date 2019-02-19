package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerAssetsinfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiCustomerAssetsinfoGetParams;

public class YouzanMeiCustomerAssetsinfoGet extends AbstractAPI {

    public YouzanMeiCustomerAssetsinfoGet() {
    }

    public YouzanMeiCustomerAssetsinfoGet(YouzanMeiCustomerAssetsinfoGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.customer.assetsinfo.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiCustomerAssetsinfoGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiCustomerAssetsinfoGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
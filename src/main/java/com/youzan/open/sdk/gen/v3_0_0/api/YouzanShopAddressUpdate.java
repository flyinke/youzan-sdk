package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressUpdateParams;

public class YouzanShopAddressUpdate extends AbstractAPI {

    public YouzanShopAddressUpdate() {
    }

    public YouzanShopAddressUpdate(YouzanShopAddressUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.address.update";
    }

    public Class getResultModelClass() {
        return YouzanShopAddressUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopAddressUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
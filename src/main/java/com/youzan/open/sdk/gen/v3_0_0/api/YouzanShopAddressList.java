package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressListParams;

public class YouzanShopAddressList extends AbstractAPI {

    public YouzanShopAddressList() {
    }

    public YouzanShopAddressList(YouzanShopAddressListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.address.list";
    }

    public Class getResultModelClass() {
        return YouzanShopAddressListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopAddressListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
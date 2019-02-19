package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopAddressDeleteParams;

public class YouzanShopAddressDelete extends AbstractAPI {

    public YouzanShopAddressDelete() {
    }

    public YouzanShopAddressDelete(YouzanShopAddressDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.shop.address.delete";
    }

    public Class getResultModelClass() {
        return YouzanShopAddressDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanShopAddressDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
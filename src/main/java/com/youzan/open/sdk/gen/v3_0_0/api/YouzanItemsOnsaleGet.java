package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsOnsaleGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsOnsaleGetParams;

public class YouzanItemsOnsaleGet extends AbstractAPI {

    public YouzanItemsOnsaleGet() {
    }

    public YouzanItemsOnsaleGet(YouzanItemsOnsaleGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.items.onsale.get";
    }

    public Class getResultModelClass() {
        return YouzanItemsOnsaleGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemsOnsaleGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
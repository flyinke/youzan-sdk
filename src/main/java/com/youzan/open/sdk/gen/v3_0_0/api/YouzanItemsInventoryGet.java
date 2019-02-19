package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsInventoryGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemsInventoryGetParams;

public class YouzanItemsInventoryGet extends AbstractAPI {

    public YouzanItemsInventoryGet() {
    }

    public YouzanItemsInventoryGet(YouzanItemsInventoryGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.items.inventory.get";
    }

    public Class getResultModelClass() {
        return YouzanItemsInventoryGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemsInventoryGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
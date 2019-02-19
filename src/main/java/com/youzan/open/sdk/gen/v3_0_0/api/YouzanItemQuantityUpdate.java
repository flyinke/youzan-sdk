package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemQuantityUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemQuantityUpdateParams;

public class YouzanItemQuantityUpdate extends AbstractAPI {

    public YouzanItemQuantityUpdate() {
    }

    public YouzanItemQuantityUpdate(YouzanItemQuantityUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.quantity.update";
    }

    public Class getResultModelClass() {
        return YouzanItemQuantityUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemQuantityUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
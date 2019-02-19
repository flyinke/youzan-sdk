package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemUpdateParams;

public class YouzanItemUpdate extends AbstractAPI {

    public YouzanItemUpdate() {
    }

    public YouzanItemUpdate(YouzanItemUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.update";
    }

    public Class getResultModelClass() {
        return YouzanItemUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
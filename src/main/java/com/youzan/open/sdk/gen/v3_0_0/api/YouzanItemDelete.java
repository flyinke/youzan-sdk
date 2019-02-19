package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemDeleteParams;

public class YouzanItemDelete extends AbstractAPI {

    public YouzanItemDelete() {
    }

    public YouzanItemDelete(YouzanItemDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.delete";
    }

    public Class getResultModelClass() {
        return YouzanItemDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
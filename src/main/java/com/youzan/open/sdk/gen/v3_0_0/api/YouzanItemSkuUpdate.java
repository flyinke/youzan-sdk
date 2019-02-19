package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSkuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemSkuUpdateParams;

public class YouzanItemSkuUpdate extends AbstractAPI {

    public YouzanItemSkuUpdate() {
    }

    public YouzanItemSkuUpdate(YouzanItemSkuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.sku.update";
    }

    public Class getResultModelClass() {
        return YouzanItemSkuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemSkuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
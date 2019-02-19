package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusBatchDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusBatchDeleteParams;

public class YouzanRetailProductSpusBatchDelete extends AbstractAPI {

    public YouzanRetailProductSpusBatchDelete() {
    }

    public YouzanRetailProductSpusBatchDelete(YouzanRetailProductSpusBatchDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spus.batch.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpusBatchDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpusBatchDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
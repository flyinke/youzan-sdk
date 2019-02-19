package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusDeleteParams;

public class YouzanRetailProductSkusDelete extends AbstractAPI {

    public YouzanRetailProductSkusDelete() {
    }

    public YouzanRetailProductSkusDelete(YouzanRetailProductSkusDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.skus.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkusDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkusDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
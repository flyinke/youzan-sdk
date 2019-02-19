package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusConfirmationDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSkusConfirmationDeleteParams;

public class YouzanRetailProductSkusConfirmationDelete extends AbstractAPI {

    public YouzanRetailProductSkusConfirmationDelete() {
    }

    public YouzanRetailProductSkusConfirmationDelete(YouzanRetailProductSkusConfirmationDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.skus.confirmation.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSkusConfirmationDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSkusConfirmationDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
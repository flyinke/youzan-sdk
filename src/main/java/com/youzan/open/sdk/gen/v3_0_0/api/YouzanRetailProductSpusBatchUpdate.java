package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusBatchUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpusBatchUpdateParams;

public class YouzanRetailProductSpusBatchUpdate extends AbstractAPI {

    public YouzanRetailProductSpusBatchUpdate() {
    }

    public YouzanRetailProductSpusBatchUpdate(YouzanRetailProductSpusBatchUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spus.batch.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpusBatchUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpusBatchUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductSpuUpdateParams;

public class YouzanRetailProductSpuUpdate extends AbstractAPI {

    public YouzanRetailProductSpuUpdate() {
    }

    public YouzanRetailProductSpuUpdate(YouzanRetailProductSpuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.spu.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductSpuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductSpuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
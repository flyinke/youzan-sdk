package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitUpdateParams;

public class YouzanRetailProductUnitUpdate extends AbstractAPI {

    public YouzanRetailProductUnitUpdate() {
    }

    public YouzanRetailProductUnitUpdate(YouzanRetailProductUnitUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.unit.update";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductUnitUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductUnitUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
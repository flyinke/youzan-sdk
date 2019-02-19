package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitsDeleteResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRetailProductUnitsDeleteParams;

public class YouzanRetailProductUnitsDelete extends AbstractAPI {

    public YouzanRetailProductUnitsDelete() {
    }

    public YouzanRetailProductUnitsDelete(YouzanRetailProductUnitsDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.retail.product.units.delete";
    }

    public Class getResultModelClass() {
        return YouzanRetailProductUnitsDeleteResult.class;
    }

    public Class getParamModelClass() {
        return YouzanRetailProductUnitsDeleteParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
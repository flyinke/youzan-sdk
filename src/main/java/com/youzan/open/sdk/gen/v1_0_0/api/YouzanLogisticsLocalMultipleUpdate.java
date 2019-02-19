package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsLocalMultipleUpdateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsLocalMultipleUpdateParams;

public class YouzanLogisticsLocalMultipleUpdate extends AbstractAPI {

    public YouzanLogisticsLocalMultipleUpdate() {
    }

    public YouzanLogisticsLocalMultipleUpdate(YouzanLogisticsLocalMultipleUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.logistics.local.multiple.update";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsLocalMultipleUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsLocalMultipleUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
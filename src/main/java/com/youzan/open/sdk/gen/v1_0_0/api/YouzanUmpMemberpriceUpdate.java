package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpMemberpriceUpdateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanUmpMemberpriceUpdateParams;

public class YouzanUmpMemberpriceUpdate extends AbstractAPI {

    public YouzanUmpMemberpriceUpdate() {
    }

    public YouzanUmpMemberpriceUpdate(YouzanUmpMemberpriceUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.ump.memberprice.update";
    }

    public Class getResultModelClass() {
        return YouzanUmpMemberpriceUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanUmpMemberpriceUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
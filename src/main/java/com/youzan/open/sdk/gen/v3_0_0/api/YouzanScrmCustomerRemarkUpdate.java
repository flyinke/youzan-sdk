package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerRemarkUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerRemarkUpdateParams;

public class YouzanScrmCustomerRemarkUpdate extends AbstractAPI {

    public YouzanScrmCustomerRemarkUpdate() {
    }

    public YouzanScrmCustomerRemarkUpdate(YouzanScrmCustomerRemarkUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.scrm.customer.remark.update";
    }

    public Class getResultModelClass() {
        return YouzanScrmCustomerRemarkUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanScrmCustomerRemarkUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
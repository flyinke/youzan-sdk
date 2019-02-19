package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCrmCustomerPointsSyncResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCrmCustomerPointsSyncParams;

public class YouzanCrmCustomerPointsSync extends AbstractAPI {

    public YouzanCrmCustomerPointsSync() {
    }

    public YouzanCrmCustomerPointsSync(YouzanCrmCustomerPointsSyncParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.crm.customer.points.sync";
    }

    public Class getResultModelClass() {
        return YouzanCrmCustomerPointsSyncResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmCustomerPointsSyncParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
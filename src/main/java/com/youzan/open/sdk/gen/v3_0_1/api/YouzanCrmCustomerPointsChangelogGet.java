package com.youzan.open.sdk.gen.v3_0_1.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsChangelogGetResult;
import com.youzan.open.sdk.gen.v3_0_1.model.YouzanCrmCustomerPointsChangelogGetParams;

public class YouzanCrmCustomerPointsChangelogGet extends AbstractAPI {

    public YouzanCrmCustomerPointsChangelogGet() {
    }

    public YouzanCrmCustomerPointsChangelogGet(YouzanCrmCustomerPointsChangelogGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.1";
    }

    public String getName() {
        return "youzan.crm.customer.points.changelog.get";
    }

    public Class getResultModelClass() {
        return YouzanCrmCustomerPointsChangelogGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmCustomerPointsChangelogGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
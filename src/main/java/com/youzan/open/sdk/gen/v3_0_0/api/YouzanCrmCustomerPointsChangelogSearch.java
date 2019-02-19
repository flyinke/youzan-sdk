package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCrmCustomerPointsChangelogSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanCrmCustomerPointsChangelogSearchParams;

public class YouzanCrmCustomerPointsChangelogSearch extends AbstractAPI {

    public YouzanCrmCustomerPointsChangelogSearch() {
    }

    public YouzanCrmCustomerPointsChangelogSearch(YouzanCrmCustomerPointsChangelogSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.crm.customer.points.changelog.search";
    }

    public Class getResultModelClass() {
        return YouzanCrmCustomerPointsChangelogSearchResult.class;
    }

    public Class getParamModelClass() {
        return YouzanCrmCustomerPointsChangelogSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
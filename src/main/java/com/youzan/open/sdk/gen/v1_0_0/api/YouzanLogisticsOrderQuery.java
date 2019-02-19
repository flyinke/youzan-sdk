package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsOrderQueryResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsOrderQueryParams;

public class YouzanLogisticsOrderQuery extends AbstractAPI {

    public YouzanLogisticsOrderQuery() {
    }

    public YouzanLogisticsOrderQuery(YouzanLogisticsOrderQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.logistics.order.query";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOrderQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOrderQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
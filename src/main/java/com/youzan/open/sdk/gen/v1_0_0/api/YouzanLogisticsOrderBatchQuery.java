package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsOrderBatchQueryResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanLogisticsOrderBatchQueryParams;

public class YouzanLogisticsOrderBatchQuery extends AbstractAPI {

    public YouzanLogisticsOrderBatchQuery() {
    }

    public YouzanLogisticsOrderBatchQuery(YouzanLogisticsOrderBatchQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.logistics.order.batch.query";
    }

    public Class getResultModelClass() {
        return YouzanLogisticsOrderBatchQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanLogisticsOrderBatchQueryParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
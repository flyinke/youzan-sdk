package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiOrderListParams;

public class YouzanMeiOrderList extends AbstractAPI {

    public YouzanMeiOrderList() {
    }

    public YouzanMeiOrderList(YouzanMeiOrderListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.order.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiOrderListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiOrderListParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
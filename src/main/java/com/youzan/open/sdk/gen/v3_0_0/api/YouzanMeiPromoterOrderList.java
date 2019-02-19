package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterOrderListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiPromoterOrderListParams;

public class YouzanMeiPromoterOrderList extends AbstractAPI {

    public YouzanMeiPromoterOrderList() {
    }

    public YouzanMeiPromoterOrderList(YouzanMeiPromoterOrderListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.promoter.order.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiPromoterOrderListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiPromoterOrderListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcDeliveryDelivermultiissueResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouzanTradeDcDeliveryDelivermultiissueParams;

public class YouzanTradeDcDeliveryDelivermultiissue extends AbstractAPI {

    public YouzanTradeDcDeliveryDelivermultiissue() {
    }

    public YouzanTradeDcDeliveryDelivermultiissue(YouzanTradeDcDeliveryDelivermultiissueParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youzan.trade.dc.delivery.delivermultiissue";
    }

    public Class getResultModelClass() {
        return YouzanTradeDcDeliveryDelivermultiissueResult.class;
    }

    public Class getParamModelClass() {
        return YouzanTradeDcDeliveryDelivermultiissueParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
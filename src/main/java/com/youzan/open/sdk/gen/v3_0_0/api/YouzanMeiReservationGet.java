package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationGetParams;

public class YouzanMeiReservationGet extends AbstractAPI {

    public YouzanMeiReservationGet() {
    }

    public YouzanMeiReservationGet(YouzanMeiReservationGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationCancelResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationCancelParams;

public class YouzanMeiReservationCancel extends AbstractAPI {

    public YouzanMeiReservationCancel() {
    }

    public YouzanMeiReservationCancel(YouzanMeiReservationCancelParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.cancel";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationCancelResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationCancelParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
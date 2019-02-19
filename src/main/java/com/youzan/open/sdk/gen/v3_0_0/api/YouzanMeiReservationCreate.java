package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationCreateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationCreateParams;

public class YouzanMeiReservationCreate extends AbstractAPI {

    public YouzanMeiReservationCreate() {
    }

    public YouzanMeiReservationCreate(YouzanMeiReservationCreateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.create";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationCreateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationCreateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
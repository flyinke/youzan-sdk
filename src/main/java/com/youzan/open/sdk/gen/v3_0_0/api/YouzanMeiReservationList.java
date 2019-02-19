package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationListParams;

public class YouzanMeiReservationList extends AbstractAPI {

    public YouzanMeiReservationList() {
    }

    public YouzanMeiReservationList(YouzanMeiReservationListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationTimeRangeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationTimeRangeGetParams;

public class YouzanMeiReservationTimeRangeGet extends AbstractAPI {

    public YouzanMeiReservationTimeRangeGet() {
    }

    public YouzanMeiReservationTimeRangeGet(YouzanMeiReservationTimeRangeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.time.range.get";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationTimeRangeGetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationTimeRangeGetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationTechnicianListResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanMeiReservationTechnicianListParams;

public class YouzanMeiReservationTechnicianList extends AbstractAPI {

    public YouzanMeiReservationTechnicianList() {
    }

    public YouzanMeiReservationTechnicianList(YouzanMeiReservationTechnicianListParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.mei.reservation.technician.list";
    }

    public Class getResultModelClass() {
        return YouzanMeiReservationTechnicianListResult.class;
    }

    public Class getParamModelClass() {
        return YouzanMeiReservationTechnicianListParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
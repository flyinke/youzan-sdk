package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomUpdateParams;

public class YouzanItemHotelRoomUpdate extends AbstractAPI {

    public YouzanItemHotelRoomUpdate() {
    }

    public YouzanItemHotelRoomUpdate(YouzanItemHotelRoomUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.hotel.room.update";
    }

    public Class getResultModelClass() {
        return YouzanItemHotelRoomUpdateResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemHotelRoomUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
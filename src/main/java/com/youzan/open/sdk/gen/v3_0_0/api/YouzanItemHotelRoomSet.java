package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomSetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomSetParams;

public class YouzanItemHotelRoomSet extends AbstractAPI {

    public YouzanItemHotelRoomSet() {
    }

    public YouzanItemHotelRoomSet(YouzanItemHotelRoomSetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.hotel.room.set";
    }

    public Class getResultModelClass() {
        return YouzanItemHotelRoomSetResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemHotelRoomSetParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}
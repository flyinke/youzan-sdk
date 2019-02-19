package com.youzan.open.sdk.gen.v3_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomQueryResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemHotelRoomQueryParams;

public class YouzanItemHotelRoomQuery extends AbstractAPI {

    public YouzanItemHotelRoomQuery() {
    }

    public YouzanItemHotelRoomQuery(YouzanItemHotelRoomQueryParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "3.0.0";
    }

    public String getName() {
        return "youzan.item.hotel.room.query";
    }

    public Class getResultModelClass() {
        return YouzanItemHotelRoomQueryResult.class;
    }

    public Class getParamModelClass() {
        return YouzanItemHotelRoomQueryParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}
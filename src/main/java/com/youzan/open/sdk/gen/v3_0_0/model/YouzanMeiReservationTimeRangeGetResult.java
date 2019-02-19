package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanMeiReservationTimeRangeGetResult implements APIResult {

    @JsonProperty(value = "reservation_start_time")
    /**
     * 可预约开始时间
     */
    private Long reservationStartTime;
    @JsonProperty(value = "reservation_end_time")
    /**
     * 可预约结束时间
     */
    private Long reservationEndTime;
    @JsonProperty(value = "unreservable_time")
    /**
     * 不可预约时间段列表
     */
    private MeiUnreservableTime[] unreservableTime;

    public void setReservationStartTime(Long reservationStartTime) {
        this.reservationStartTime = reservationStartTime;
    }

    public Long getReservationStartTime() {
        return this.reservationStartTime;
    }
    public void setReservationEndTime(Long reservationEndTime) {
        this.reservationEndTime = reservationEndTime;
    }

    public Long getReservationEndTime() {
        return this.reservationEndTime;
    }
    public void setUnreservableTime(MeiUnreservableTime[] unreservableTime) {
        this.unreservableTime = unreservableTime;
    }

    public MeiUnreservableTime[] getUnreservableTime() {
        return this.unreservableTime;
    }

    public static class MeiUnreservableTime {
            @JsonProperty(value = "start_time")
        /**
        * 不可预约开始时间
        */
        private Long startTime;
            @JsonProperty(value = "end_time")
        /**
        * 不可预约结束时间
        */
        private Long endTime;
            @JsonProperty(value = "status")
        /**
        * 不可预约原因
101 已经被预约满的不可预约时间
102 商家定义的不可预约时间
        */
        private Long status;
    
            public void setStartTime(Long startTime) {
            this.startTime = startTime;
        }

        public Long getStartTime() {
            return this.startTime;
        }

            public void setEndTime(Long endTime) {
            this.endTime = endTime;
        }

        public Long getEndTime() {
            return this.endTime;
        }

            public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }

        }


}
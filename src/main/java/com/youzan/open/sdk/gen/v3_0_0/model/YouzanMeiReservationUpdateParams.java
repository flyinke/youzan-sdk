package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanMeiReservationUpdateParams implements APIParams, FileParams  {

    /**
     * 预约时间
     */
    private Long arriveAt;
    /**
     * 预约的分店id
     */
    private Long deptId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 预约的服务项目
     */
    private String reservationItems;
    /**
     * 预约单单号
     */
    private String reservationOrderNo;

    public void setArriveAt(Long arriveAt) {
        this.arriveAt = arriveAt;
    }

    public Long getArriveAt() {
        return this.arriveAt;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getDeptId() {
        return this.deptId;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
    }

    public void setReservationItems(String reservationItems) {
        this.reservationItems = reservationItems;
    }

    public String getReservationItems() {
        return this.reservationItems;
    }

    public void setReservationOrderNo(String reservationOrderNo) {
        this.reservationOrderNo = reservationOrderNo;
    }

    public String getReservationOrderNo() {
        return this.reservationOrderNo;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (arriveAt != null) {
            params.put("arrive_at", arriveAt);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (reservationItems != null) {
            params.put("reservation_items", reservationItems);
        }
        if (reservationOrderNo != null) {
            params.put("reservation_order_no", reservationOrderNo);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
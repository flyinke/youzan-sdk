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

public class YouzanMeiReservationCreateParams implements APIParams, FileParams  {

    /**
     * 预约到店时间
     */
    private Long arriveAt;
    /**
     * 顾客姓名
     */
    private String customerName;
    /**
     * 预约的分店id
     */
    private Long deptId;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 顾客手机号
     */
    private String mobile;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 预约的服务项目
     */
    private String reservationItems;

    public void setArriveAt(Long arriveAt) {
        this.arriveAt = arriveAt;
    }

    public Long getArriveAt() {
        return this.arriveAt;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setReservationItems(String reservationItems) {
        this.reservationItems = reservationItems;
    }

    public String getReservationItems() {
        return this.reservationItems;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (arriveAt != null) {
            params.put("arrive_at", arriveAt);
        }
        if (customerName != null) {
            params.put("customer_name", customerName);
        }
        if (deptId != null) {
            params.put("dept_id", deptId);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (remark != null) {
            params.put("remark", remark);
        }
        if (reservationItems != null) {
            params.put("reservation_items", reservationItems);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
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

public class YouzanSalesmanAccountScoreSearchParams implements APIParams, FileParams  {

    /**
     * 结束时间（时间戳，单位秒，如1540867540）
     */
    private Long endTime;
    /**
     * 粉丝id（mobile或fans_id选其一，另者置为0，都填以mobile为准）
     */
    private Long fansId;
    /**
     * 粉丝类型（自有粉丝: fans_type = 1）
     */
    private Long fansType;
    /**
     * 手机号（mobile或fans_id选其一，另者置为0，都填以mobile为准）
     */
    private String mobile;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页记录数
     */
    private Long pageSize;
    /**
     * 开始时间（时间戳，单位秒，如1535597140）
     */
    private Long startTime;

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setFansId(Long fansId) {
        this.fansId = fansId;
    }

    public Long getFansId() {
        return this.fansId;
    }

    public void setFansType(Long fansType) {
        this.fansType = fansType;
    }

    public Long getFansType() {
        return this.fansType;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getStartTime() {
        return this.startTime;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (endTime != null) {
            params.put("end_time", endTime);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (startTime != null) {
            params.put("start_time", startTime);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
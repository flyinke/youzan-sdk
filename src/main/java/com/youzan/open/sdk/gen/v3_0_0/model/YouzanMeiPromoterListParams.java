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

public class YouzanMeiPromoterListParams implements APIParams, FileParams  {

    /**
     * 加入的结束时间，时间的毫秒值
     */
    private Long endTime;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 推广员手机号
     */
    private String mobile;
    /**
     * 要查询的页码
     */
    private Long page;
    /**
     * 每页显示的条目数量，最大200条
     */
    private Long pageSize;
    /**
     * 加入的开始时间，时间的毫秒值
     */
    private Long startTime;

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getEndTime() {
        return this.endTime;
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

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
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
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (mobile != null) {
            params.put("mobile", mobile);
        }
        if (page != null) {
            params.put("page", page);
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
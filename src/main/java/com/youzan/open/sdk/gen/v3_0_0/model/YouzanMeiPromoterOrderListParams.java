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

public class YouzanMeiPromoterOrderListParams implements APIParams, FileParams  {

    /**
     * 订单完成时间的搜索终止时间
     */
    private Long endTime;
    /**
     * 搜索的关键词，可以是手机号或者是订单号
     */
    private String keyword;
    /**
     * 美业token
     */
    private String mToken;
    /**
     * 要查询的页码
     */
    private Long page;
    /**
     * 每页显示的条目数量，最大200条
     */
    private Long pageSize;
    /**
     * 订单状态
     */
    private Long settleStatus;
    /**
     * 订单完成时间的搜索起始时间
     */
    private Long startTime;

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setMToken(String mToken) {
        this.mToken = mToken;
    }

    public String getMToken() {
        return this.mToken;
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

    public void setSettleStatus(Long settleStatus) {
        this.settleStatus = settleStatus;
    }

    public Long getSettleStatus() {
        return this.settleStatus;
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
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (mToken != null) {
            params.put("m_token", mToken);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (settleStatus != null) {
            params.put("settle_status", settleStatus);
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
package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanUmpLimitdiscountDetailSearchParams implements APIParams, FileParams  {

    /**
     * 活动id
     */
    private Long activityId;
    /**
     * 页码，最大翻页限制:4000
     */
    private Long pageNo;
    /**
     * 每页条数,最大支持:200
     */
    private Long pageSize;

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (activityId != null) {
            params.put("activity_id", activityId);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
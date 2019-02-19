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

public class YouzanUmpCouponSearchParams implements APIParams, FileParams  {

    /**
     * 活动类型 PROMOCARD 优惠券，PROMOCODE 优惠码
     */
    private String groupType;
    /**
     * 第几页
     */
    private Long pageNo;
    /**
     * 每页数量
     */
    private Long pageSize;
    /**
     * 活动状态 FUTURE 未开始 ,END 已结束,ON 进行中 （默认查所有状态）
     */
    private String status;

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupType() {
        return this.groupType;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (groupType != null) {
            params.put("group_type", groupType);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (status != null) {
            params.put("status", status);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
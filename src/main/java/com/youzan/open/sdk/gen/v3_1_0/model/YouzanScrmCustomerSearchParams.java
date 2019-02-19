package com.youzan.open.sdk.gen.v3_1_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.api.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class YouzanScrmCustomerSearchParams implements APIParams, FileParams  {

    /**
     * 成为客户的时间，截止值，时间戳格式，单位是秒
     */
    private Long createdAtEnd;
    /**
     * 成为客户的时间，起始值，时间戳格式，单位是秒
     */
    private Long createdAtStart;
    /**
     * 是否为会员，0表示非会员，1表示会员
     */
    private Long isMember;
    /**
     * 页码，最多支持500页(500页是以每页默认值20为单位，客户查询最大为10000)
     */
    private Long pageNo;
    /**
     * 每页数量，最多支持50个
     */
    private Long pageSize;

    public void setCreatedAtEnd(Long createdAtEnd) {
        this.createdAtEnd = createdAtEnd;
    }

    public Long getCreatedAtEnd() {
        return this.createdAtEnd;
    }

    public void setCreatedAtStart(Long createdAtStart) {
        this.createdAtStart = createdAtStart;
    }

    public Long getCreatedAtStart() {
        return this.createdAtStart;
    }

    public void setIsMember(Long isMember) {
        this.isMember = isMember;
    }

    public Long getIsMember() {
        return this.isMember;
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
        if (createdAtEnd != null) {
            params.put("created_at_end", createdAtEnd);
        }
        if (createdAtStart != null) {
            params.put("created_at_start", createdAtStart);
        }
        if (isMember != null) {
            params.put("is_member", isMember);
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
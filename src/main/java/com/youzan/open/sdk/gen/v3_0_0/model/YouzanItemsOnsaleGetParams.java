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

public class YouzanItemsOnsaleGetParams implements APIParams, FileParams  {

    /**
     * 排序方式。格式为column:asc/desc，目前排序字段：1.创建时间：created_time，2.更新时间：update_time，3.价格：price，4.销量：sold_num
     */
    private String orderBy;
    /**
     * 页码，不传或为0时默认设置为1
     */
    private Long pageNo;
    /**
     * 每页条数，最大300个，不传或为0时默认设置为40
     */
    private Long pageSize;
    /**
     * 搜索字段。搜索商品的title
     */
    private String q;
    /**
     * 商品标签的ID
     */
    private Long tagId;
    /**
     * 商品终止更新时间，单位为ms
     */
    private Long updateTimeEnd;
    /**
     * 商品初始更新时间，单位为ms
     */
    private Long updateTimeStart;

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
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

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return this.q;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public void setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public Long getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public void setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public Long getUpdateTimeStart() {
        return this.updateTimeStart;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (orderBy != null) {
            params.put("order_by", orderBy);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (q != null) {
            params.put("q", q);
        }
        if (tagId != null) {
            params.put("tag_id", tagId);
        }
        if (updateTimeEnd != null) {
            params.put("update_time_end", updateTimeEnd);
        }
        if (updateTimeStart != null) {
            params.put("update_time_start", updateTimeStart);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
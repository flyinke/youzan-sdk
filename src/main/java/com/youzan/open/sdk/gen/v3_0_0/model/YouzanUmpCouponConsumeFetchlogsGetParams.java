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

public class YouzanUmpCouponConsumeFetchlogsGetParams implements APIParams, FileParams  {

    /**
     * 优惠券/优惠码id
     */
    private Long couponGroupId;
    /**
     * 按照领取时间筛选（结束时间）格式：'2017-09-09 17:12:41'
     */
    private Date endTaked;
    /**
     * 页码
     */
    private Long pageNo;
    /**
     * 每页数量，最大值500
     */
    private Long pageSize;
    /**
     * 按照领取时间筛选（开始时间）格式：'2017-09-09 17:12:41'
     */
    private Date startTaked;

    public void setCouponGroupId(Long couponGroupId) {
        this.couponGroupId = couponGroupId;
    }

    public Long getCouponGroupId() {
        return this.couponGroupId;
    }

    public void setEndTaked(Date endTaked) {
        this.endTaked = endTaked;
    }

    public Date getEndTaked() {
        return this.endTaked;
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

    public void setStartTaked(Date startTaked) {
        this.startTaked = startTaked;
    }

    public Date getStartTaked() {
        return this.startTaked;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (couponGroupId != null) {
            params.put("coupon_group_id", couponGroupId);
        }
        if (endTaked != null) {
            params.put("end_taked", endTaked);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (startTaked != null) {
            params.put("start_taked", startTaked);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
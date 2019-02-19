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

public class YouzanCardvoucherValuecardRfndRcdBypubSearchParams implements APIParams, FileParams  {

    /**
     * 充值时间范围 ，查询beginTime之后发生的记录，格式yyyy-MM-dd HH:mm:ss
     */
    private String beginTime;
    /**
     * 客户Id
     */
    private Long buyerId;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 充值时间范围 ，查询endTime之前发生的记录，格式yyyy-MM-dd HH:mm:ss
     */
    private String endTime;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 查询第几页，默认1
     */
    private Long page;
    /**
     * 分页大小，默认20 ，目前最大支持50
     */
    private Long pageSize;

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getBeginTime() {
        return this.beginTime;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return this.endTime;
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


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (beginTime != null) {
            params.put("begin_time", beginTime);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (cardNo != null) {
            params.put("card_no", cardNo);
        }
        if (endTime != null) {
            params.put("end_time", endTime);
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
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}
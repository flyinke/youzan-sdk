package com.youzan.open.sdk.gen.v3_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.APIParams;
import com.youzan.open.sdk.api.FileParams;
import com.youzan.open.sdk.api.APIResult;
import com.youzan.open.sdk.model.ByteWrapper;
import java.util.List;
import java.util.Map;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YouzanScrmCustomerCardListResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 会员拥有的会员卡总数
     */
    private Long total;
    @JsonProperty(value = "page")
    /**
     * 当前页码
     */
    private Long page;
    @JsonProperty(value = "page_size")
    /**
     * 每页的最大记录条数
     */
    private Long pageSize;
    @JsonProperty(value = "items")
    /**
     * 会员卡列表
     */
    private CustomerCardListItemDTO[] items;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
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
    public void setItems(CustomerCardListItemDTO[] items) {
        this.items = items;
    }

    public CustomerCardListItemDTO[] getItems() {
        return this.items;
    }

    public static class CustomerCardListItemDTO {
            @JsonProperty(value = "card_end_time")
        /**
        * 会员卡有效期截止日期
        */
        private Date cardEndTime;
            @JsonProperty(value = "card_start_time")
        /**
        * 会员卡有效期开始日期
        */
        private Date cardStartTime;
            @JsonProperty(value = "card_no")
        /**
        * 用户会员卡卡号
        */
        private String cardNo;
            @JsonProperty(value = "card_alias")
        /**
        * 商家会员卡的唯一标识
        */
        private String cardAlias;
    
            public void setCardEndTime(Date cardEndTime) {
            this.cardEndTime = cardEndTime;
        }

        public Date getCardEndTime() {
            return this.cardEndTime;
        }

            public void setCardStartTime(Date cardStartTime) {
            this.cardStartTime = cardStartTime;
        }

        public Date getCardStartTime() {
            return this.cardStartTime;
        }

            public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public String getCardNo() {
            return this.cardNo;
        }

            public void setCardAlias(String cardAlias) {
            this.cardAlias = cardAlias;
        }

        public String getCardAlias() {
            return this.cardAlias;
        }

        }


}
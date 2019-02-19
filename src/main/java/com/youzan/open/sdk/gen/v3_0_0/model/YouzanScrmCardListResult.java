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

public class YouzanScrmCardListResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 会员卡总数
     */
    private Long total;
    @JsonProperty(value = "page")
    /**
     * 页码
     */
    private Long page;
    @JsonProperty(value = "page_size")
    /**
     * 每页最大纪录数
     */
    private Long pageSize;
    @JsonProperty(value = "items")
    /**
     * 会员卡列表
     */
    private CardListItemDTO[] items;

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
    public void setItems(CardListItemDTO[] items) {
        this.items = items;
    }

    public CardListItemDTO[] getItems() {
        return this.items;
    }

    public static class CardListItemDTO {
            @JsonProperty(value = "card_alias")
        /**
        * 商家会员卡的唯一标识
        */
        private String cardAlias;
            @JsonProperty(value = "name")
        /**
        * 会员卡名称
        */
        private String name;
            @JsonProperty(value = "card_link")
        /**
        * 发卡链接
        */
        private String cardLink;
            @JsonProperty(value = "is_available")
        /**
        * 会员卡状态：使用中:true 已禁用:false
        */
        private Boolean isAvailable;
            @JsonProperty(value = "create_time")
        /**
        * 会员卡创建时间
        */
        private Date createTime;
            @JsonProperty(value = "grant_type")
        /**
        * 会员卡类型;3:无门槛卡,2:付费卡,1:规则卡
        */
        private Long grantType;
    
            public void setCardAlias(String cardAlias) {
            this.cardAlias = cardAlias;
        }

        public String getCardAlias() {
            return this.cardAlias;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setCardLink(String cardLink) {
            this.cardLink = cardLink;
        }

        public String getCardLink() {
            return this.cardLink;
        }

            public void setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

            public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }

        public Date getCreateTime() {
            return this.createTime;
        }

            public void setGrantType(Long grantType) {
            this.grantType = grantType;
        }

        public Long getGrantType() {
            return this.grantType;
        }

        }


}
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

public class YouzanScrmCustomerSearchResult implements APIResult {

    @JsonProperty(value = "total")
    /**
     * 会员卡对应的会员个数
     */
    private Long total;
    @JsonProperty(value = "page")
    /**
     * 当前页码
     */
    private Long page;
    @JsonProperty(value = "page_size")
    /**
     * 每页的记录数20
     */
    private Long pageSize;
    @JsonProperty(value = "items")
    /**
     * 客户信息项
     */
    private CardCustomerListItemDTO[] items;

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
    public void setItems(CardCustomerListItemDTO[] items) {
        this.items = items;
    }

    public CardCustomerListItemDTO[] getItems() {
        return this.items;
    }

    public static class CardCustomerListItemDTO {
            @JsonProperty(value = "name")
        /**
        * 客户名称
        */
        private String name;
            @JsonProperty(value = "fans_id")
        /**
        * 粉丝id
        */
        private Long fansId;
            @JsonProperty(value = "fasn_type")
        /**
        * 粉丝类型
        */
        private Long fasnType;
            @JsonProperty(value = "mobile")
        /**
        * 客户手机号
        */
        private String mobile;
            @JsonProperty(value = "wx_nickname")
        /**
        * 微信昵称
        */
        private String wxNickname;
    
            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

            public void setFasnType(Long fasnType) {
            this.fasnType = fasnType;
        }

        public Long getFasnType() {
            return this.fasnType;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setWxNickname(String wxNickname) {
            this.wxNickname = wxNickname;
        }

        public String getWxNickname() {
            return this.wxNickname;
        }

        }


}
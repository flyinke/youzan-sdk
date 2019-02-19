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

public class YouzanSalesmanCustomersGetResult implements APIResult {

    @JsonProperty(value = "total_results")
    /**
     * 记录总数
     */
    private Long totalResults;
    @JsonProperty(value = "customers")
    /**
     * 客户列表
     */
    private SalesmanCustomerDetail[] customers;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }
    public void setCustomers(SalesmanCustomerDetail[] customers) {
        this.customers = customers;
    }

    public SalesmanCustomerDetail[] getCustomers() {
        return this.customers;
    }

    public static class SalesmanCustomerDetail {
            @JsonProperty(value = "nickname")
        /**
        * 客户昵称
        */
        private String nickname;
            @JsonProperty(value = "avatar")
        /**
        * 客户头像
        */
        private String avatar;
            @JsonProperty(value = "fans_type")
        /**
        * 粉丝类型
        */
        private Long fansType;
            @JsonProperty(value = "fans_id")
        /**
        * 粉丝Id
        */
        private Long fansId;
    
            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }

            public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return this.avatar;
        }

            public void setFansType(Long fansType) {
            this.fansType = fansType;
        }

        public Long getFansType() {
            return this.fansType;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

        }


}
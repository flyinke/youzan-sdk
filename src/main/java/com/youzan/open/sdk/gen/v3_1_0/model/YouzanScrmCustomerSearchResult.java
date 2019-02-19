package com.youzan.open.sdk.gen.v3_1_0.model;

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
     * 列表总数
     */
    private Long total;
    @JsonProperty(value = "record_list")
    /**
     * 客户列表返回对象列表
     */
    private CustomerResultDTO[] recordList;

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getTotal() {
        return this.total;
    }
    public void setRecordList(CustomerResultDTO[] recordList) {
        this.recordList = recordList;
    }

    public CustomerResultDTO[] getRecordList() {
        return this.recordList;
    }

    public static class CustomerResultDTO {
            @JsonProperty(value = "name")
        /**
        * 姓名
        */
        private String name;
            @JsonProperty(value = "gender")
        /**
        * 性别
        */
        private Long gender;
            @JsonProperty(value = "yz_uid")
        /**
        * 用户ID,即buyer_id
        */
        private Long yzUid;
            @JsonProperty(value = "mobile")
        /**
        * 手机号
        */
        private String mobile;
            @JsonProperty(value = "weixin_fans_id")
        /**
        * 微信粉丝ID，预留字段，同fans_id,建议使用下面的fans_id字段
        */
        private Long weixinFansId;
            @JsonProperty(value = "is_member")
        /**
        * 是否是会员
        */
        private Long isMember;
            @JsonProperty(value = "trade_count")
        /**
        * 购次
        */
        private Long tradeCount;
            @JsonProperty(value = "points")
        /**
        * 积分
        */
        private Long points;
            @JsonProperty(value = "card_ids")
        /**
        * 会员卡ID
        */
        private Number[] cardIds;
            @JsonProperty(value = "created_at")
        /**
        * 成为客户的时间，时间戳格式，单位秒
        */
        private Long createdAt;
            @JsonProperty(value = "member_created_at")
        /**
        * 成为会员的时间，时间戳格式，单位秒
        */
        private Long memberCreatedAt;
            @JsonProperty(value = "fans_id")
        /**
        * 粉丝ID
        */
        private Long fansId;
            @JsonProperty(value = "show_name")
        /**
        * 推荐展示姓名(showname可以等于name、可以等于mobile、可以等于nickname，取值顺序为手机-姓名-昵称)
        */
        private String showName;
    
            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setGender(Long gender) {
            this.gender = gender;
        }

        public Long getGender() {
            return this.gender;
        }

            public void setYzUid(Long yzUid) {
            this.yzUid = yzUid;
        }

        public Long getYzUid() {
            return this.yzUid;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setWeixinFansId(Long weixinFansId) {
            this.weixinFansId = weixinFansId;
        }

        public Long getWeixinFansId() {
            return this.weixinFansId;
        }

            public void setIsMember(Long isMember) {
            this.isMember = isMember;
        }

        public Long getIsMember() {
            return this.isMember;
        }

            public void setTradeCount(Long tradeCount) {
            this.tradeCount = tradeCount;
        }

        public Long getTradeCount() {
            return this.tradeCount;
        }

            public void setPoints(Long points) {
            this.points = points;
        }

        public Long getPoints() {
            return this.points;
        }

            public void setCardIds(Number[] cardIds) {
            this.cardIds = cardIds;
        }

        public Number[] getCardIds() {
            return this.cardIds;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setMemberCreatedAt(Long memberCreatedAt) {
            this.memberCreatedAt = memberCreatedAt;
        }

        public Long getMemberCreatedAt() {
            return this.memberCreatedAt;
        }

            public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }

            public void setShowName(String showName) {
            this.showName = showName;
        }

        public String getShowName() {
            return this.showName;
        }

        }


}
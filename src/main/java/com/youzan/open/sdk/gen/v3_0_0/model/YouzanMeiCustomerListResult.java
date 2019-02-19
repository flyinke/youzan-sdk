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

public class YouzanMeiCustomerListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 列表条目信息
     */
    private MeiCustomerInfoListSummary[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiCustomerInfoListSummary[] items) {
        this.items = items;
    }

    public MeiCustomerInfoListSummary[] getItems() {
        return this.items;
    }

    public static class MeiCustomerInfoListSummary {
            @JsonProperty(value = "average_amount")
        /**
        * 平均消费金额
        */
        private Long averageAmount;
            @JsonProperty(value = "gender")
        /**
        * 性别
        */
        private Long gender;
            @JsonProperty(value = "level")
        /**
        * 等级
        */
        private Long level;
            @JsonProperty(value = "member_no")
        /**
        * 编号
        */
        private String memberNo;
            @JsonProperty(value = "trade_count")
        /**
        * 交易次数
        */
        private Long tradeCount;
            @JsonProperty(value = "level_alias")
        /**
        * 等级别名
        */
        private String levelAlias;
            @JsonProperty(value = "mobile")
        /**
        * 手机号
        */
        private String mobile;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "memo_name")
        /**
        * 商家写的备注姓名
        */
        private String memoName;
            @JsonProperty(value = "consultant_ids")
        /**
        * 营销顾问id列表
        */
        private Number[] consultantIds;
            @JsonProperty(value = "source_type")
        /**
        * 用户来源类别
        */
        private Long sourceType;
            @JsonProperty(value = "avatar")
        /**
        * 头像url
        */
        private String avatar;
            @JsonProperty(value = "member_name")
        /**
        * 商家写的会员名
        */
        private String memberName;
            @JsonProperty(value = "last_trade_time")
        /**
        * 上次交易时间
        */
        private Long lastTradeTime;
            @JsonProperty(value = "belong_dept_id")
        /**
        * 附属门店id
        */
        private Long belongDeptId;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "level_name")
        /**
        * 等级名称
        */
        private String levelName;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
            @JsonProperty(value = "member")
        /**
        * 是否是会员。1表示是会员
        */
        private Long member;
            @JsonProperty(value = "name")
        /**
        * 买家自己写的名称
        */
        private String name;
            @JsonProperty(value = "total_trade_amount")
        /**
        * 总交易金额
        */
        private Long totalTradeAmount;
            @JsonProperty(value = "customer_source")
        /**
        * 会员来源id
        */
        private Long customerSource;
            @JsonProperty(value = "source_id")
        /**
        * 用户源ID
        */
        private Long sourceId;
    
            public void setAverageAmount(Long averageAmount) {
            this.averageAmount = averageAmount;
        }

        public Long getAverageAmount() {
            return this.averageAmount;
        }

            public void setGender(Long gender) {
            this.gender = gender;
        }

        public Long getGender() {
            return this.gender;
        }

            public void setLevel(Long level) {
            this.level = level;
        }

        public Long getLevel() {
            return this.level;
        }

            public void setMemberNo(String memberNo) {
            this.memberNo = memberNo;
        }

        public String getMemberNo() {
            return this.memberNo;
        }

            public void setTradeCount(Long tradeCount) {
            this.tradeCount = tradeCount;
        }

        public Long getTradeCount() {
            return this.tradeCount;
        }

            public void setLevelAlias(String levelAlias) {
            this.levelAlias = levelAlias;
        }

        public String getLevelAlias() {
            return this.levelAlias;
        }

            public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobile() {
            return this.mobile;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setMemoName(String memoName) {
            this.memoName = memoName;
        }

        public String getMemoName() {
            return this.memoName;
        }

            public void setConsultantIds(Number[] consultantIds) {
            this.consultantIds = consultantIds;
        }

        public Number[] getConsultantIds() {
            return this.consultantIds;
        }

            public void setSourceType(Long sourceType) {
            this.sourceType = sourceType;
        }

        public Long getSourceType() {
            return this.sourceType;
        }

            public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return this.avatar;
        }

            public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberName() {
            return this.memberName;
        }

            public void setLastTradeTime(Long lastTradeTime) {
            this.lastTradeTime = lastTradeTime;
        }

        public Long getLastTradeTime() {
            return this.lastTradeTime;
        }

            public void setBelongDeptId(Long belongDeptId) {
            this.belongDeptId = belongDeptId;
        }

        public Long getBelongDeptId() {
            return this.belongDeptId;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setLevelName(String levelName) {
            this.levelName = levelName;
        }

        public String getLevelName() {
            return this.levelName;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

            public void setMember(Long member) {
            this.member = member;
        }

        public Long getMember() {
            return this.member;
        }

            public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

            public void setTotalTradeAmount(Long totalTradeAmount) {
            this.totalTradeAmount = totalTradeAmount;
        }

        public Long getTotalTradeAmount() {
            return this.totalTradeAmount;
        }

            public void setCustomerSource(Long customerSource) {
            this.customerSource = customerSource;
        }

        public Long getCustomerSource() {
            return this.customerSource;
        }

            public void setSourceId(Long sourceId) {
            this.sourceId = sourceId;
        }

        public Long getSourceId() {
            return this.sourceId;
        }

        }

    public static class MeiPaginator {
            @JsonProperty(value = "total_count")
        /**
        * 总记录数
        */
        private Long totalCount;
            @JsonProperty(value = "page")
        /**
        * 第几页
        */
        private Long page;
            @JsonProperty(value = "page_size")
        /**
        * 每页显示的记录数
        */
        private Long pageSize;
    
            public void setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
        }

        public Long getTotalCount() {
            return this.totalCount;
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

        }


}
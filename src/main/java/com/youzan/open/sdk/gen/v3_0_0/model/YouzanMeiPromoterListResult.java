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

public class YouzanMeiPromoterListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 推广员列表
     */
    private MeiPromoterDetail[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiPromoterDetail[] items) {
        this.items = items;
    }

    public MeiPromoterDetail[] getItems() {
        return this.items;
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

    public static class MeiPromoterDetail {
            @JsonProperty(value = "order_count")
        /**
        * 该推广员产生的订单数量
        */
        private Long orderCount;
            @JsonProperty(value = "created_at")
        /**
        * 推广员添加时间
        */
        private Long createdAt;
            @JsonProperty(value = "pid")
        /**
        * 推广的id标识
        */
        private Long pid;
            @JsonProperty(value = "invitation_count")
        /**
        * 推广员发展的下线推广员数量
        */
        private Long invitationCount;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "verify_at")
        /**
        * 推广员通过审核的时间
        */
        private Long verifyAt;
            @JsonProperty(value = "avatar_url")
        /**
        * 头像
        */
        private String avatarUrl;
            @JsonProperty(value = "parent_profit")
        /**
        * 贡献给上线推广员的收益总和
        */
        private Long parentProfit;
            @JsonProperty(value = "phone")
        /**
        * 联系电话
        */
        private String phone;
            @JsonProperty(value = "nickname")
        /**
        * 昵称
        */
        private String nickname;
            @JsonProperty(value = "parent_pid")
        /**
        * 上线推广员id
        */
        private Long parentPid;
            @JsonProperty(value = "parent_phone")
        /**
        * 上线推广员联系电话
        */
        private String parentPhone;
            @JsonProperty(value = "total_profit")
        /**
        * 总推广收益
        */
        private Long totalProfit;
            @JsonProperty(value = "parent_nickname")
        /**
        * 上线推广员昵称
        */
        private String parentNickname;
            @JsonProperty(value = "customer_count")
        /**
        * 该推广员的客户数量
        */
        private Long customerCount;
            @JsonProperty(value = "updated_at")
        /**
        * 更新时间
        */
        private Long updatedAt;
    
            public void setOrderCount(Long orderCount) {
            this.orderCount = orderCount;
        }

        public Long getOrderCount() {
            return this.orderCount;
        }

            public void setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

            public void setPid(Long pid) {
            this.pid = pid;
        }

        public Long getPid() {
            return this.pid;
        }

            public void setInvitationCount(Long invitationCount) {
            this.invitationCount = invitationCount;
        }

        public Long getInvitationCount() {
            return this.invitationCount;
        }

            public void setKdtId(Long kdtId) {
            this.kdtId = kdtId;
        }

        public Long getKdtId() {
            return this.kdtId;
        }

            public void setVerifyAt(Long verifyAt) {
            this.verifyAt = verifyAt;
        }

        public Long getVerifyAt() {
            return this.verifyAt;
        }

            public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getAvatarUrl() {
            return this.avatarUrl;
        }

            public void setParentProfit(Long parentProfit) {
            this.parentProfit = parentProfit;
        }

        public Long getParentProfit() {
            return this.parentProfit;
        }

            public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return this.phone;
        }

            public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getNickname() {
            return this.nickname;
        }

            public void setParentPid(Long parentPid) {
            this.parentPid = parentPid;
        }

        public Long getParentPid() {
            return this.parentPid;
        }

            public void setParentPhone(String parentPhone) {
            this.parentPhone = parentPhone;
        }

        public String getParentPhone() {
            return this.parentPhone;
        }

            public void setTotalProfit(Long totalProfit) {
            this.totalProfit = totalProfit;
        }

        public Long getTotalProfit() {
            return this.totalProfit;
        }

            public void setParentNickname(String parentNickname) {
            this.parentNickname = parentNickname;
        }

        public String getParentNickname() {
            return this.parentNickname;
        }

            public void setCustomerCount(Long customerCount) {
            this.customerCount = customerCount;
        }

        public Long getCustomerCount() {
            return this.customerCount;
        }

            public void setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        }


}
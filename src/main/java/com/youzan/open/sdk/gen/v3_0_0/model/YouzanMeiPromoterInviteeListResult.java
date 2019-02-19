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

public class YouzanMeiPromoterInviteeListResult implements APIResult {

    @JsonProperty(value = "paginator")
    /**
     * 分页信息
     */
    private MeiPaginator paginator;
    @JsonProperty(value = "items")
    /**
     * 邀请的推广员列表信息
     */
    private MeiPromoterInvitee[] items;

    public void setPaginator(MeiPaginator paginator) {
        this.paginator = paginator;
    }

    public MeiPaginator getPaginator() {
        return this.paginator;
    }
    public void setItems(MeiPromoterInvitee[] items) {
        this.items = items;
    }

    public MeiPromoterInvitee[] getItems() {
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

    public static class MeiPromoterInvitee {
            @JsonProperty(value = "order_count")
        /**
        * 产生的订单数量
        */
        private Long orderCount;
            @JsonProperty(value = "created_at")
        /**
        * 创建时间
        */
        private Long createdAt;
            @JsonProperty(value = "pid")
        /**
        * 推广员id
        */
        private String pid;
            @JsonProperty(value = "kdt_id")
        /**
        * 店铺id
        */
        private Long kdtId;
            @JsonProperty(value = "verify_at")
        /**
        * 审核通过时间
        */
        private Long verifyAt;
            @JsonProperty(value = "avatar_url")
        /**
        * 头像地址
        */
        private String avatarUrl;
            @JsonProperty(value = "parent_profit")
        /**
        * 贡献给上线推广员的收益
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
        private String parentPid;
            @JsonProperty(value = "parent_phone")
        /**
        * 上线推广员联系电话
        */
        private String parentPhone;
            @JsonProperty(value = "total_profit")
        /**
        * 获取的总收益
        */
        private Long totalProfit;
            @JsonProperty(value = "parent_nickname")
        /**
        * 上线推广员昵称
        */
        private String parentNickname;
    
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

            public void setPid(String pid) {
            this.pid = pid;
        }

        public String getPid() {
            return this.pid;
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

            public void setParentPid(String parentPid) {
            this.parentPid = parentPid;
        }

        public String getParentPid() {
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

        }


}